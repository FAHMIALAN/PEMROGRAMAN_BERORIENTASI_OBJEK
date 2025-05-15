import java.util.Scanner;

public class hitung_l_k {
    public static void main(String[] args) {
        Tgs_2_PersegiPanjang persegi = new Tgs_2_PersegiPanjang();
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();
        persegi.setPanjang(panjang);

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();
        persegi.setLebar(lebar);

        persegi.tampil();

        input.close();
    }
}
