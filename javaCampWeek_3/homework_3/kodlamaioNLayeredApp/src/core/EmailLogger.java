package core;

public class EmailLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("E-Postaya giriş yapıldı.");
    }
}
