import java.util.Scanner;
public class Runpraktikmotor_mod6 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        praktikmotor_mod6 encap = new praktikmotor_mod6();

        System.out.print("Masukkan Warna Motor: ");
        encap.setWarna(input.nextLine());

        System.out.print("Masukkan Jenis Motor: ");
        encap.setJenis(input.nextLine()); // Gunakan nextLine() karena jenis motor berupa string

        System.out.print("Masukkan Merek Motor: ");
        encap.setMerek(input.nextLine());

        System.out.print("Masukkan Tahun Pembelian Motor: ");
        encap.setTahun(Integer.parseInt(input.nextLine())); // Konversi input menjadi integer

        System.out.print("Masukkan Pemilik Motor: ");
        encap.setPemilik(input.nextLine());

        System.out.print("Masukkan Alamat Pemilik: ");
        encap.setAlamat(input.nextLine());

        System.out.print("Masukkan Harga motor: ");
        encap.setHarga(Integer.parseInt(input.nextLine())); // Konversi input menjadi integer

        System.out.println("Warna : " + encap.getWarna());
        System.out.println("Jenis : " + encap.getJenis());
        System.out.println("Merek : " + encap.getMerek());
        System.out.println("Tahun  : " + encap.getTahun());
        System.out.println("Pemilik : " + encap.getPemilik());
        System.out.println("Alamat : " + encap.getAlamat());
        System.out.println("Harga : " + encap.getHarga());
    }
}


