package ru.mushroom.jack.Domain.Alive;

import ru.mushroom.jack.Domain.Unit;

public abstract class Alive extends Unit {
    private Integer hitPoint;
    private Integer spellPoint;
    private Integer defence;
    private Integer hit;

    public Integer getHitPoint(){
        return this.hitPoint;
    }

    public void setHitPoint(Integer hitPoint){
        this.hitPoint = hitPoint;
    }

    public Integer getSpellPoint(){
        return this.spellPoint;
    }

    public void setSpellPoint(Integer spellPoint){
        this.spellPoint = spellPoint;
    }

    public Integer getDefence(){
        return this.defence;
    }

    public void setDefence(Integer defence){
        this.defence = defence;
    }

    public Integer getHit(){
        return this.hit;
    }

    public void setHit(Integer hit){
        this.hit = hit;
    }
}
