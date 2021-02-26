package FactoryMethod.Refactoring_1;

public class SQLConnection extends Connection{
    public void connect(){
        System.out.println("Connecting to the SQL database...");
    }
}
