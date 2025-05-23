public class Pegawai_mod6 {
    private String nama;
    private String jabatan;
    private int gaji;

    public Pegawai_mod6(String nama, String jabatan, int gaji) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void cetakPegawai() {
        System.out.println("===================");
        System.out.println("Nama Pegawai: " + this.nama);
        System.out.println("Jabatan: " + this.jabatan);
        System.out.println("Gaji Pokok: " + this.gaji);
    }
}
