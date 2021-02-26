package FactoryMethod.Refactoring_1;

public class Client {
    public static boolean getOpt(int opt){
        return true;
    }//lấy từ file cấu hình hoặc người dùng

    public static void main(String[] args){
        App app;
        if(getOpt(1)){
            app=new SQLApp();}
        else {
            app=new NoSQLApp();
        }
        app.run();
    }
}
