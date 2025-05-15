public class Buku_mod6 {
    private String judul;
    private int harga;
    private int halaman;

    public Buku_mod6(String judul, int harga, int halaman) {
        this.judul = judul;
        this.harga = harga;
        this.halaman = halaman;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHalaman() {
        return halaman;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }

    public void tampil() {
        System.out.println("Judul buku: " + judul);
        System.out.println("Harga buku: " + harga);
        System.out.println("Jumlah halaman: " + halaman);
    }
}



