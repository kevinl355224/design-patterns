package game;

import game.behavior.AxeBehavior;

public class GameSimulator {
    public static void main(String[] args) {
        System.out.println("\n---- This is the King ----");
        Character king = new King();
        king.display();
        king.fight();

        System.out.println("\n---- This is the Knight ----");
        Character knight = new Knight();
        knight.display();
        knight.fight();
        System.out.println("( Change weapon )");
        knight.setWeapon(new AxeBehavior());
        knight.fight();
    }
    
}
