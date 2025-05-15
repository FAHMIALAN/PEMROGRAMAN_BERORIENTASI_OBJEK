class HewanPeliharaan {
    void suara() {
        System.out.println("Hewan peliharaan mengeluarkan suara.");
    }
}

class Anjing extends HewanPeliharaan {
    @Override
    void suara() {
        System.out.println("Anjing menggonggong: Woof! Woof!");
    }
}

class Kucing extends HewanPeliharaan {
    @Override
    void suara() {
        System.out.println("Kucing mengeong: Meow! Meow!");
    }
}

class Burung extends HewanPeliharaan {
    @Override
    void suara() {
        System.out.println("Burung berkicau: Tweet! Tweet!");
    }
}

public class SistemHewanPeliharaan_pbo8 {
    public static void main(String[] args) {
        HewanPeliharaan anjing = new Anjing();
        HewanPeliharaan kucing = new Kucing();
        HewanPeliharaan burung = new Burung();

        anjing.suara();
        kucing.suara();
        burung.suara();
    }
}






