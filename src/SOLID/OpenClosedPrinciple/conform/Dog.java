package SOLID.OpenClosedPrinciple.conform;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void communicate() {
        System.out.println("A dog named " + super.getName() + " barks");
    }
}
