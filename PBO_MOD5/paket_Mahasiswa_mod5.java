package mahasiswa;

public class paket_Mahasiswa_mod5 {

    String nama;
    int umur;

    public static void isiPaket() {
        System.out.println("Ini hasil import");
    }

    public void setData(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void info() {
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
    }
}
