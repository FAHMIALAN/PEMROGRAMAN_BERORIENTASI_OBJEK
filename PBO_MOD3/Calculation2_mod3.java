class Calculation2_mod3 {
    private int a, b;
    private double c, d;

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(double c, double d) {
        System.out.println(c + d);
    }
    void sum(int a, double d) {
        System.out.println(a + d);
    }

    public static void main(String args[]) {
        Calculation2_mod3 obj = new Calculation2_mod3();
        obj.sum(10.5, 10.5);
        obj.sum(20, 20);
        obj.sum(10, 15);
    }
}



