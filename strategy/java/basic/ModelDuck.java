package basic;

import basic.behavior.FlyWithWings;
import basic.behavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a Model duck.");
    }
}
