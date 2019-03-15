package ru.mushroom.jack.Domain;

public class Coordinate {
    private Integer x;
    private Integer y;

    public Coordinate(Integer x, Integer y){
        this.setX(x);
        this.setY(y);
    }

    public Integer getX(){
        return this.x;
    }

    public void setX(Integer x){
        this.x = x;
    }

    public Integer getY(){
        return this.y;
    }

    public void setY(Integer y){
        this.y = y;
    }
}
