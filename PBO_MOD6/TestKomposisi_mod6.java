public class TestKomposisi_mod6 {
    public static void main(String[] args) {
        Pegawai_mod6 david = new Pegawai_mod6("David", "Manager", 5000000);
        Perusahaan_mod6 kantor1 = new Perusahaan_mod6(david);
        kantor1.cetakPerush();
    }
}



