import java.util.Scanner;
public class hitungpangkat_mod3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta user untuk memasukkan bilangan
        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();

        // Meminta user untuk memasukkan pangkat
        System.out.print("Masukkan pangkat: ");
        int pangkat = scanner.nextInt();

        // Membuat objek BilanganBerpangkat
        BilanganBerpangkat_mod3 bp = new BilanganBerpangkat_mod3 (bilangan, pangkat);

        // Menampilkan hasil perhitungan
        System.out.println(bp.toString());
    }
}


