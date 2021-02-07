package OpenClosedPrinciple.conform;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void communicate() {
        System.out.println("A cat named " + super.getName() + " meows");
    }
}
