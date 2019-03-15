package ru.mushroom.jack.Domain;

public interface Unit {
    /*private String name;
    private String unitType
    private Integer hitPoint;
    private Integer spellPoint;
    private Integer defence;
    private Integer hit;*/

    String getName();
    void setName(String name);
    String getUnitType();
    void setUnitType(String unitType);
    Integer getHitPoint();
    void setHitPoint(Integer hitPoint);
    Integer getSpellPoint();
    void setSpellPoint(Integer spellPoint);
    Integer getDefence();
    void setDefence(Integer defence);
    Integer getHit();
    void setHit(Integer hit);
}
