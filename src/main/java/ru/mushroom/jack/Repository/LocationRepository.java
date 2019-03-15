package ru.mushroom.jack.Repository;

import org.springframework.data.repository.CrudRepository;
import ru.mushroom.jack.Domain.Coordinate;
import ru.mushroom.jack.Domain.Location;

import java.util.List;
import java.util.Optional;

public interface LocationRepository extends CrudRepository<Location, Coordinate> {
    List<Location> findAll();
    Optional<Location> findById(Coordinate coordinate);
}
