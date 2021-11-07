package com.company;

public abstract class Warrior {
    protected String army;
    protected IWeapon weapon;

    public Warrior(String army){
        this.army = army;
    }
    public void setWeapon(IWeapon weapon){
        this.weapon = weapon;
    }
    public void useWeapon(){ }
}
