public class SPP_mod9 extends Mahasiswa_mod9 {
    private double spp;

    public SPP_mod9(String nama, String alamat, int kategori) {
        super(nama, alamat, kategori);
        setSPP(computeSPPByKategori(kategori));
    }

    private double computeSPPByKategori(int kategori) {
        switch (kategori) {
            case 1:
                return 1200.00;
            case 2:
                return 2400.00;
            case 3:
                return 3600.00;
            default:
                return 0.0;
        }
    }
    public void mailCheck() {
        System.out.println("Within mailCheck SPP");
        System.out.println("Mailing check to " + getNama() + " with SPP " + spp);
    }
    public double getSPP() {
        return spp;
    }
    public void setSPP(double newSPP) {
        if (newSPP >= 0.0) {
            spp = newSPP;
        }
    }
    public double computeSPP() {
        System.out.println("Computing SPP pay for " + getNama());
        return spp / 12; // Asumsikan SPP dibayarkan bulanan
    }
}


