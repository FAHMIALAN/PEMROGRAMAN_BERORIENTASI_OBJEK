
public class komputer_mod4 {

    String merekKomputer;
    int berapaGB;
    String jenisprocesor;
    int berapaharga;

    komputer_mod4(String merek, int ram, String procesor, int harga) // konstruktor
    {
        merekKomputer = merek;
        berapaGB = ram;
        jenisprocesor = procesor;
        berapaharga = harga;

    }

    komputer_mod4() //konstruktor
    {
        merekKomputer = " ASUS ROG";
        berapaGB = 32;
        jenisprocesor = " INTEL EVO 9";
        berapaharga = 42000000;
    }

    void Show() {
        System.out.println("Informasi Komputer");
        System.out.println("Nama : " + merekKomputer);
        System.out.println("RAM : " + berapaGB);
        System.out.println("Procesor : " + jenisprocesor);
        System.out.println("Harga : " + berapaharga);
    }

    public static void main(String args[]) {
        komputer_mod4 komputer_mod41 = new komputer_mod4();
        komputer_mod4 komputer_mod42 = new komputer_mod4("LENOVO LEGION",
                32, "AMDA RYZEN 9", 37000000);
        komputer_mod41.Show();
        komputer_mod42.Show();
    }
}


