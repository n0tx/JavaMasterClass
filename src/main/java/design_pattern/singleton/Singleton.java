package design_pattern.singleton;

public class Singleton {

    // Membuat instance tunggal dari kelas Singleton
    private static Singleton instance;

    // Membuat constructor menjadi private untuk mencegah instansiasi luar
    private Singleton(){}

    // Metode untuk mendapatkan satu-satunya instance dari kelas ini
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
