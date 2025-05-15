import java.util.Scanner;

public class Runmahasiswa_dinamis_mod5 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Mahasiswa_mod5 encap = new Mahasiswa_mod5();
        
        System.out.print("Masukkan Nama Mahasiswa: ");
        encap.setNama(input.nextLine());
        
        System.out.print("Masukkan Jurusan Mahasiswa: ");
        encap.setJurusan(input.nextLine());
        
        System.out.print("Masukkan Umur Mahasiswa: ");
        encap.setUmur(input.nextInt());
        
        System.out.println("Nama : " + encap.getNama() + " , Jurusan : " + encap.getJurusan() + " , Umur : " + encap.getUmur());
    }
}
