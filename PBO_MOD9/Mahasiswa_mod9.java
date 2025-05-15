public abstract class Mahasiswa_mod9 {
    private String nama;
    private String alamat;
    private int kategori;

    public Mahasiswa_mod9(String nama, String alamat, int kategori) {
        System.out.println("Constructing Mahasiswa");
        this.nama = nama;
        this.alamat = alamat;
        this.kategori = kategori;
    }
    public double computeSPP() {
        System.out.println("Inside Mahasiswa computeSPP");
        return 0.0;
    }
    public void mailCheck() {
        System.out.println("Mailing a check to " + this.nama + " " + this.alamat);
    }
    public String toString() {
        return nama + " " + alamat + " " + kategori;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String newAlamat) {
        alamat = newAlamat;
    }
    public int getKategori() {
        return kategori;
    }
}

