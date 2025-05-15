abstract class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }

    abstract void suara();
}
    class Kucing extends Hewan {
        Kucing(String nama) {
            super(nama);
        }

        @Override
        void suara() {
            System.out.println(nama + " berkata: Meow");
        }
    }
    class Anjing extends Hewan {
        Anjing(String nama) {
            super(nama);
        }

        @Override
        void suara() {
            System.out.println(nama + " berkata: Guk");
        }
    }
public class KebunBinatang_mod11 {
    public static void main(String[] args) {
        Hewan kucing = new Kucing("Kucing Anggora");
        Hewan anjing = new Anjing("Anjing Bulldog");

        kucing.suara();
        anjing.suara();
    }
}


