
public class Buku_mod4 {

    private String judul;
    private int harga;
    private int halaman;
    private String penerbit;
    private String pengarang;

    // Constructor tanpa parameter 
    public Buku_mod4() {
    }

    // Constructor dengan parameter
    public Buku_mod4(String judul, int harga, int halaman, String pengarang, String penerbit) {
        this.judul = judul;
        this.harga = harga;
        this.halaman = halaman;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
    }

    // Method untuk menampilkan informasi buku
    public void tampil() {
        System.out.println("Judul Buku : " + judul);
        System.out.println("Harga Buku : " + harga);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Nama Pengarang : " + pengarang);
        System.out.println("Nama Penerbit : " + penerbit);
    }

    // Method untuk mengatur atribut-atribut buku
    public void setBuku_mod4(String judul, int harga, int halaman, String pengarang, String penerbit) {
        this.judul = judul;
        this.harga = harga;
        this.halaman = halaman;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
    }
}
