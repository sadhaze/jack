package ru.mushroom.jack.Repository;

import org.springframework.data.repository.CrudRepository;
import ru.mushroom.jack.Domain.Unit;

import java.util.List;
import java.util.Optional;

public interface PlayerRepository extends CrudRepository<Unit, String> {
    List<Unit> findAll();
    Optional<Unit> findById(String name);
}