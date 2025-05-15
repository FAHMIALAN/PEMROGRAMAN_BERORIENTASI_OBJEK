public class BilanganBerpangkat_mod3 {
    private int bilangan;
    private int pangkat;

    public BilanganBerpangkat_mod3 (int bilangan, int pangkat) {
        this.bilangan = bilangan;
        this.pangkat = pangkat;
    }

    public int getBilangan() {
        return bilangan;
    }

    public void setBilangan(int bilangan) {
        this.bilangan = bilangan;
    }

    public int getPangkat() {
        return pangkat;
    }

    public void setPangkat(int pangkat) {
        this.pangkat = pangkat;
    }

    public int hitungPangkat() {
        int hasil = 1;
        for (int i = 1; i <= pangkat; i++) {
            hasil *= bilangan;
        }
        return hasil;
    }

    public String toString() {
        return "Bilangan " + bilangan + " pangkat " + pangkat + " = " + hitungPangkat();
    }
}


