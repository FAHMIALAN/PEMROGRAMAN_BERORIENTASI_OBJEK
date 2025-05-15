import java.util.Scanner;

public class Tgs_2_PersegiPanjang {
    double panjang;
    double lebar;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double luas() {
        return (panjang * lebar);
    }

    public double keliling() {
        return (2 * (panjang + lebar));
    }

    public void tampil() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + luas());
        System.out.println("Keliling: " + keliling());
    }
}
