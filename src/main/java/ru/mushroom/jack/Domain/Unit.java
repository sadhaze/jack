package ru.mushroom.jack.Domain;

public abstract class Unit {
    private Coordinate position;
    private Long id;
    private Orientation orientation;
    private String unitType;

    public Coordinate getPosition(){
        return this.position;
    }

    public void setPosition(Coordinate position){
        this.position = position;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Orientation getOrientation(){
        return this.orientation;
    }

    public void setOrientation(Orientation orientation){
        this.orientation = orientation;
    }

    public String getUnitType(){
        return this.unitType;
    }

    public void setUnitType(String unitType){
        this.unitType = unitType;
    }
}
