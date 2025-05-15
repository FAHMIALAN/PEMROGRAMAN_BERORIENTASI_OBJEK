class Hitung_mod3 {
    private int a, b, c, d;

    void tambah(int a, int b) {
        System.out.println(a + b);
    }

    void tambah(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void tambah(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    public static void main(String args[]) {
        Hitung_mod3 obj = new Hitung_mod3();
        obj.tambah(10, 10, 10);
        obj.tambah(20, 20);
        obj.tambah(20, 5, 10, 20);
    }
}


