package withoutpattern;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck.");
    }
    @Override
    public void fly() {
        System.out.println("I'm flying with wings.");
    }
    @Override
    public void quack() {
        System.out.println("Quack.");
    }
}
