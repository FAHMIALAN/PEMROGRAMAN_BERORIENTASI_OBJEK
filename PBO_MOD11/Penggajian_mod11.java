class Penggajian_mod11 {
    double gapok;
    double masa_kerja;

    Penggajian_mod11(double g, double mk) {
        gapok = g;
        masa_kerja = mk;
    }

    Penggajian_mod11() {
        gapok = 0;
        masa_kerja = 0;
    }

    Penggajian_mod11(double lembur) {
        gapok = masa_kerja = lembur;
    }

    double hitung_gaji() {
        return gapok * masa_kerja;
    }
}

class OverloadingKonstruktor {
    public static void main(String args[]) {
        Penggajian_mod11 Karyawan1 = new Penggajian_mod11(10, 15);
        Penggajian_mod11 Karyawan2 = new Penggajian_mod11();
        Penggajian_mod11 Karyawan3 = new Penggajian_mod11(5);
        double gaji;
        gaji = Karyawan1.hitung_gaji();
        System.out.println("Gaji Karyawan 1= " + gaji);
        gaji = Karyawan2.hitung_gaji();
        System.out.println("Gaji Karyawan 2= " + gaji);
        gaji = Karyawan3.hitung_gaji();
        System.out.println("Gaji Karyawan 3= " + gaji);
    }
}


