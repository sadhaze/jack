package ru.mushroom.jack.Domain;

import org.springframework.data.annotation.Id;

import java.util.HashMap;

public class Location {
    private String name;
    private HashMap<Coordinate, Cell> cell;

    @Id
    private Coordinate coordinate;

    public Location(String name, Coordinate coordinate){
        this.setName(name);
        this.coordinate = coordinate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public Cell getCellByCoordinate(Coordinate coordinate){
        return cell.get(coordinate);
    }
}
