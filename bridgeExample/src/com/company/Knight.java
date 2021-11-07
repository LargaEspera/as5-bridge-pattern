package com.company;

public class Knight extends Warrior {
    public Knight() {
        super("Knight of the Teutonic Order ");
    }

    @Override
    public void useWeapon(){
        System.out.print(army);
        this.weapon.attack();
    }
}
