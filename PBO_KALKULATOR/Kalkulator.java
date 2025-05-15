import java.util.Scanner;
public class Kalkulator {
    public void hitung(int a, int b) {
        System.out.println("Hasil penjumlahan: " + (a + b));
        System.out.println("Hasil pengurangan: " + (a - b));
        System.out.println("Hasil perkalian: " + (a * b));
    }

    public void hitung(double a, double b) {
        System.out.println("Hasil penjumlahan: " + (a + b));
        System.out.println("Hasil pengurangan: " + (a - b));
        System.out.println("Hasil perkalian: " + (a * b));
    }

    public void hitung(String a, String b) {
        double num1 = Double.parseDouble(a);
        double num2 = Double.parseDouble(b);
        System.out.println("Hasil penjumlahan: " + (num1 + num2));
        System.out.println("Hasil pengurangan: " + (num1 - num2));
        System.out.println("Hasil perkalian: " + (num1 * num2));
    }

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        String a = scanner.next();
        System.out.print("Masukkan angka kedua: ");
        String b = scanner.next();

        kalkulator.hitung(a, b);

        System.out.print("Masukkan bilangan bulat pertama: ");
        int c = scanner.nextInt();
        System.out.print("Masukkan bilangan bulat kedua: ");
        int d = scanner.nextInt();

        kalkulator.hitung(c, d);

        System.out.print("Masukkan bilangan desimal pertama: ");
        double e = scanner.nextDouble();
        System.out.print("Masukkan bilangan desimal kedua: ");
        double f = scanner.nextDouble();

        kalkulator.hitung(e, f);
    }
}




