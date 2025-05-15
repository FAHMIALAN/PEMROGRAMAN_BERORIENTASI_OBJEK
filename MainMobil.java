package mobil;

public class MainMobil {

    public static void main(String[] args) {
        Mobil.isiPaket();
        Mobil mobil = new Mobil();
        mobil.setData("Toyota", 2020);
        mobil.info();
    }
}
