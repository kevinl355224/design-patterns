package withoutpattern;





public class DecoyDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I'm a Decoy Duck.");
    }
    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
