public class hitungSegitiga {
    double alas;
    double tinggi;
    double sisi1;
    double sisi2;
    double sisi3;

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisi1(double sisi1) {
        this.sisi1 = sisi1;
    }

    public void setSisi2(double sisi2) {
        this.sisi2 = sisi2;
    }

    public void setSisi3(double sisi3) {
        this.sisi3 = sisi3;
    }

    public double luas() {
        return 0.5 * alas * tinggi;
    }

    public double keliling() {
        return sisi1 + sisi2 + sisi3;
    }

    public void tampil() {
        System.out.println("Alas: " + alas);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Sisi 1: " + sisi1);
        System.out.println("Sisi 2: " + sisi2);
        System.out.println("Sisi 3: " + sisi3);
        System.out.println("Luas: " + luas());
        System.out.println("Keliling: " + keliling());
    }
}


