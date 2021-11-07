package com.company;

public class Spear implements IWeapon {
    @Override
    public void attack() {
        System.out.println("is attacking with a spear. Melee attacks at a distance of 2 meter and deals 24 damage");
    }
}
