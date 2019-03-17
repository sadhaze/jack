package ru.mushroom.jack.Repository;

import org.springframework.data.repository.CrudRepository;
import ru.mushroom.jack.Domain.Cell;
import ru.mushroom.jack.Domain.Coordinate;

import java.util.List;
import java.util.Optional;

public interface CellRepository extends CrudRepository<Cell, Coordinate> {
    List<Cell> findAll();
    Optional<Cell> findById(Coordinate coordinate);
}
