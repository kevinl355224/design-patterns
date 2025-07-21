package withoutpattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        System.out.println("\n---- This is Mallard duck ----");
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.quack();
        mallard.fly();

        System.out.println("\n---- This is Rubber duck ----");
        Duck rubber = new RubberDuck();
        rubber.display();;
        rubber.quack();
        rubber.fly();

        System.out.println("\n---- This is Decoy duck ----");
        Duck decoy = new DecoyDuck();
        decoy.display();;
        decoy.quack();
        decoy.fly();
    }
}
