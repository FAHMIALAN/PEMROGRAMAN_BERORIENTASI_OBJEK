
import java.util.Scanner;

abstract class BangunDatar {

    abstract float luas();

    abstract float keliling();
}

class Persegi extends BangunDatar {

    float sisi;

    Persegi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    float luas() {
        return sisi * sisi;
    }

    @Override
    float keliling() {
        return 4 * sisi;
    }
}

class Lingkaran extends BangunDatar {

    float r;

    Lingkaran(float r) {
        this.r = r;
    }

    @Override
    float luas() {
        return (float) (3.14 * r * r);
    }

    @Override
    float keliling() {
        return (float) (2 * 3.14 * r);
    }
}

class PersegiPanjang extends BangunDatar {

    float panjang, lebar;

    PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    float luas() {
        return panjang * lebar;
    }

    @Override
    float keliling() {
        return 2 * (panjang + lebar);
    }
}

class Segitiga extends BangunDatar {

    float alas, tinggi;

    Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    float luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    float keliling() {
        return 3 * alas;
    }
}

// Main class to test the shapes
public class BangunDatar_mod12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bangun datar: ");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Segitiga");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi persegi: ");
                float sisi = scanner.nextFloat();
                Persegi persegi = new Persegi(sisi);
                System.out.println("Luas Persegi: " + persegi.luas());
                System.out.println("Keliling Persegi: " + persegi.keliling());
                break;

            case 2:
                System.out.print("Masukkan jari-jari lingkaran: ");
                float r = scanner.nextFloat();
                Lingkaran lingkaran = new Lingkaran(r);
                System.out.println("Luas Lingkaran: " + lingkaran.luas());
                System.out.println("Keliling Lingkaran: " + lingkaran.keliling());
                break;

            case 3:
                System.out.print("Masukkan panjang persegi panjang: ");
                float panjang = scanner.nextFloat();
                System.out.print("Masukkan lebar persegi panjang: ");
                float lebar = scanner.nextFloat();
                PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
                System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
                System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());
                break;

            case 4:
                System.out.print("Masukkan alas segitiga: ");
                float alas = scanner.nextFloat();
                System.out.print("Masukkan tinggi segitiga: ");
                float tinggi = scanner.nextFloat();
                Segitiga segitiga = new Segitiga(alas, tinggi);
                System.out.println("Luas Segitiga: " + segitiga.luas());
                System.out.println("Keliling Segitiga: " + segitiga.keliling());
                break;

            default:
                System.out.println("Pilihan tidak valid");
        }

        scanner.close();
    }
}
