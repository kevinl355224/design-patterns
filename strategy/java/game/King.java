package game;

import game.behavior.BowAndArrowBehavior;

public class King extends Character {

    public King() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void display() {
        System.out.println("I'm the King.");
    }
}
