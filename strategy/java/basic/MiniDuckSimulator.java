package basic;

import basic.behavior.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {

        System.out.println("\n---- This is Mallard duck ----");
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.preformFly();

        System.out.println("\n---- This is Model duck ----");
        Duck model = new ModelDuck();
        model.display();;
        model.performQuack();
        model.preformFly();
        System.out.println("( Reset fly behavior )");
        model.setFlyBehavior(new FlyRocketPowered());
        model.preformFly();;
    }
}
