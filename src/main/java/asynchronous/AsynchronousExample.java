package asynchronous;

import java.util.concurrent.CompletableFuture;

public class AsynchronousExample {
    public static void main(String[] args) {
        // Menjalankan operasi secara asinkron
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
           try {
               // Simulasi pekerjaan berat
               Thread.sleep(2000);
               System.out.println("Operasi Asynchronous selesai");
           } catch (InterruptedException e) {
               // throw new RuntimeException(e);
               e.printStackTrace();
           }
        });

        // Program tidak harus menunggu operasi di atas selesai
        System.out.println("Program utama berjalan");

        // Menunggu agar future selesai (optional)
        future.join();
    }
}
