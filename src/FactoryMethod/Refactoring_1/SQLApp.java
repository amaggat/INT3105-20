package FactoryMethod.Refactoring_1;

public class SQLApp extends App {
    public Connection createConnection() {
        return new SQLConnection();
    }
}



