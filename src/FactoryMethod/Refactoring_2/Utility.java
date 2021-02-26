package FactoryMethod.Refactoring_2;

public class Utility {
    public static Item copy(Item item){
        Item newItem = item;
        return newItem;
    }

    public static void main(String[] args) {

        Book hello = new Book(1,"Hello", 1, "Hello Publisher");
        Report world = new Report(1,"World","Technical");
        Thesis IT = new Thesis(1,"IT","Fun");

        Book newBook = (Book) copy(hello);
        Report newReport = (Report) copy(world);
        Thesis newThesis = (Thesis) copy(IT);

        System.out.println(newBook);
        System.out.println(newReport);
        System.out.println(newThesis);
    }
}
