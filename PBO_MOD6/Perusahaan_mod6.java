public class Perusahaan_mod6 {
    private String nmPerush;
    private String alamat;
    private Pegawai_mod6 peg; // Komposisi dengan relasi has-a

    public Perusahaan_mod6(Pegawai_mod6 pegawai) {
        this.nmPerush = "PT. Lancar Jaya";
        this.alamat = "Yogyakarta";
        this.peg = pegawai;
    }

    public void cetakPerush() {
        System.out.println("Nama Perusahaan: " + this.nmPerush);
        System.out.println("Alamat: " + this.alamat);
        peg.cetakPegawai();
    }
}
