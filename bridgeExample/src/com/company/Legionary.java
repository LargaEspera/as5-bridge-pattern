package com.company;

public class Legionary extends Warrior {
    public Legionary() {
        super("Rome Empire's legionary ");
    }

    @Override
    public void useWeapon(){
        System.out.print(army);
        this.weapon.attack();
    }
}
