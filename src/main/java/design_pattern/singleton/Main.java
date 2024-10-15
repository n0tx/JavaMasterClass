package design_pattern.singleton;

public class Main {

    public static void main(String[] args) {
        // Mengakses instance tunggal dari Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
        Singleton singleton2 = Singleton.getInstance();
        singleton2.showMessage();
    }
}
