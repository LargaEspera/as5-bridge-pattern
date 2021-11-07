package com.company;

public class Main {

    public static void main(String[] args) {
        IWeapon sword = new Sword();
        IWeapon spear = new Spear();

        Warrior knight = new Knight();
        knight.setWeapon(sword);
        knight.useWeapon();

        Warrior legionary = new Legionary();
        legionary.setWeapon(spear);
        legionary.useWeapon();
    }
}
