package FactoryMethod.Refactoring_1;

public abstract class App {
    public void init(){
        System.out.println("Initializing...");
    }

    public void run(){
        init();
        if (getOpt(1)) {
            Connection db = createConnection();
            db.connect();
            //100 phát biểu khác; có dùng db
        }
    };

    public static final boolean getOpt(int opt){
        return true;
    }

    public abstract Connection createConnection();
}
