public class Abstract_SPP_mod9 {
    public static void main(String[] args) {
        SPP_mod9 s = new SPP_mod9("FAIZUL", "Bantul", 3);
        Mahasiswa_mod9 e = new SPP_mod9("Kurniawan", "Sleman", 2);
        System.out.println("Panggil mailCheck pakai SPP_mod9");
        s.mailCheck();
        System.out.println("\nPanggil mailCheck pakai Mahasiswa_mod9");
        e.mailCheck();
    }
}



