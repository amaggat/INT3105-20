package SOLID.OpenClosedPrinciple.conform;

import java.util.Arrays;
import java.util.List;

public abstract class Animal {

    private String name = new String();

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void communicate() {
        System.out.println("An animal communicates");
    }

    public static void allCommmunication(List<Animal> animals){
        for (Animal animal : animals)
        {
            animal.communicate();
        }
    }

    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(
                new Animal[]{
                        new Dog("Louis Vuitton"),
                        new Cat("Gucci")
                });

        allCommmunication(animals);
    }
}

