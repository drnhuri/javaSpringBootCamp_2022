package core;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Veritabanına giriş yapıldı.");
    }
}
