package ru.mushroom.jack.Domain;

import java.util.HashMap;

public class Cell {
    private HashMap<Integer, Unit> unit;

    public Unit getUnitById(Integer id){
        return unit.get(id);
    }

    public void putUnit(Unit unit){
        this.unit.put(this.unit.size(), unit);
    }
}
