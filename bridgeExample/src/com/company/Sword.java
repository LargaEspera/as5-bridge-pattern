package com.company;

public class Sword implements IWeapon {
    @Override
    public void attack() {
        System.out.println("is attacking with a sword. Melee attacks at a distance of 1 meter and deals 38 damage");
    }
}
