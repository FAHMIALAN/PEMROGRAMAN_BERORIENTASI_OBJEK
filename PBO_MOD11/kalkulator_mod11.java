
import java.util.Scanner;

class Kalkulator {

    // Metode hitung() dengan dua argumen integer
    public int hitung(int bilangan1, int bilangan2) {
        return bilangan1 + bilangan2;
    }

    // Metode hitung() dengan dua argumen double
    public double hitung(double bilangan1, double bilangan2) {
        return bilangan1 + bilangan2;
    }
}

public class kalkulator_mod11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input bilangan pertama
        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = scanner.nextDouble();

        // Meminta input bilangan kedua
        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = scanner.nextDouble();

        // Membuat objek Kalkulator
        Kalkulator kalkulator = new Kalkulator();

        // Menghitung dan menampilkan hasil
        System.out.println("Hasil: " + kalkulator.hitung(bilangan1, bilangan2));
    }
}
