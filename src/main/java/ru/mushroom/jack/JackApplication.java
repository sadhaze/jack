package ru.mushroom.jack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.mushroom.jack.Domain.Coordinate;
import ru.mushroom.jack.Domain.Location;
import ru.mushroom.jack.Repository.LocationRepository;

import java.util.ArrayList;

@SpringBootApplication
public class JackApplication {

    @Autowired
    private LocationRepository locationRepository;

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = SpringApplication.run(JackApplication.class, args);

        LocationRepository locationRepository = context.getBean(LocationRepository.class);

        locationRepository.save(new Location("Test", new Coordinate(1, 2)));
        locationRepository.save(new Location("Test2", new Coordinate(2, 2)));
        locationRepository.save(new Location("Test3", new Coordinate(4, 2)));

        Thread.sleep(3000);

        locationRepository.findAll().forEach(p -> System.out.println(p.getName()));
        System.out.println("\n\n");
        System.out.println(locationRepository.findById(new Coordinate(4, 2)).get().getName());
        System.out.println("\n\n");
    }

}
