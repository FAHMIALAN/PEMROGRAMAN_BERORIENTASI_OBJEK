package mobil;

public class Mobil {

    String merk;
    int tahunProduksi;

    public static void isiPaket() {
        System.out.println("Ini hasil import mobil");
    }

    public void setData(String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    public void info() {
        System.out.println("Merk : " + merk);
        System.out.println("Tahun Produksi : " + tahunProduksi);
    }
}
