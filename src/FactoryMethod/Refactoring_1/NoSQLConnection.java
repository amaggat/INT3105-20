package FactoryMethod.Refactoring_1;

public class NoSQLConnection extends Connection{
    public void connect(){
        System.out.println("Connecting to the NoSQL database...");
    }
}
