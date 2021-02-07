package OpenClosedPrinciple.violate;

import java.util.Arrays;
import java.util.List;

public class Animal {
    private String type;
    private String name;

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public void communicate()
    {
        switch (this.type) {
            case "dog":
                System.out.println("A dog named " + this.name + " barks");
                break;
            case "cat":
                System.out.println("A cat named " + this.name + " meows");
                break;
        }
    }

    public static void allCommunication(List<Animal> animals){
        for (Animal animal : animals) {
            animal.communicate();
        }
    }

    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(
                new Animal[]{
                        new Animal("cat", "Gucci"),
                        new Animal("dog", "Louis Vuitton")}
                );

        allCommunication(animals);
    }
}
