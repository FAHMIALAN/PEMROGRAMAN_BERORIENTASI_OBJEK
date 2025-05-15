import java.util.Scanner;

public class L_K_segitiga {
    public static void main(String[] args) {
        hitungSegitiga hitungSegitiga = new hitungSegitiga();
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        double alas = input.nextDouble();
        hitungSegitiga.setAlas(alas);

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();
        hitungSegitiga.setTinggi(tinggi);

        System.out.print("Masukkan panjang sisi 1 segitiga: ");
        double sisi1 = input.nextDouble();
        hitungSegitiga.setSisi1(sisi1);

        System.out.print("Masukkan panjang sisi 2 segitiga: ");
        double sisi2 = input.nextDouble();
        hitungSegitiga.setSisi2(sisi2);

        System.out.print("Masukkan panjang sisi 3 segitiga: ");
        double sisi3 = input.nextDouble();
        hitungSegitiga.setSisi3(sisi3);

        hitungSegitiga.tampil();

        input.close();
    } 
}



