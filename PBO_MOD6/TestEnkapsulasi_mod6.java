public class TestEnkapsulasi_mod6 {
    public static void main(String[] args) {
        Pegawai_mod6 dataPeg = new Pegawai_mod6("Budi", "Supervisor", 4000000);
        dataPeg.cetakPegawai();

        Perusahaan_mod6 kantor2 = new Perusahaan_mod6(dataPeg);
        kantor2.cetakPerush();
    }
}

