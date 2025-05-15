public class Abstract_Demo_mod9 {
    public static void main(String[] args) {
        Gaji_mod9 s = new Gaji_mod9("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Karyawan_mod9 e = new Gaji_mod9("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("Panggil mailCheck pakai Gaji_mod9");
        s.mailCheck();
        System.out.println("\nPanggil mailCheck pakai Karyawan_mod9");
        e.mailCheck();
    }
}


