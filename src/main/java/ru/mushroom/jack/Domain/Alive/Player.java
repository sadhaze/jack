package ru.mushroom.jack.Domain.Alive;

import org.springframework.data.annotation.Id;
import ru.mushroom.jack.Domain.Coordinate;
import ru.mushroom.jack.Domain.Orientation;

public class Player extends Alive {
    @Id
    private String name;

    public Player(
            Coordinate position,
            Long id,
            Orientation orientation,
            String name,
            String unitType,
            Integer hitPoint,
            Integer spellPoint,
            Integer defence,
            Integer hit
    ){
        super.setPosition(position);
        super.setId(id);
        super.setOrientation(orientation);
        this.setName(name);
        super.setUnitType(unitType);
        super.setHitPoint(hitPoint);
        super.setSpellPoint(spellPoint);
        super.setDefence(defence);
        super.setHit(hit);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
