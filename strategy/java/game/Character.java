package game;

import game.behavior.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weaponBehavior;
    
    public void fight() {
        weaponBehavior.useWeapon();
    };

    public abstract void display();

    public void setWeapon(WeaponBehavior w) {
        this.weaponBehavior = w;
    }
}
