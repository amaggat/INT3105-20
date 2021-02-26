package FactoryMethod.Refactoring_1;

public class NoSQLApp extends App {
    public Connection createConnection() {
        return new NoSQLConnection();
    }
}