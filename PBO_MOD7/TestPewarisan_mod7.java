class Mahasiswa_mod7 extends Manusia_mod7 {
    private String nim;
    private String jurusan;

    public Mahasiswa_mod7() {
        nama = "Kurniawati";
        umur = 19;
        this.nim = "145419674";
        this.jurusan = "TI";
    }

    public void cetak() {
        System.out.println("======DATA MAHASISWA====");
        System.out.println("NIM :" + nim);
        System.out.println("Nama:" + nama);
        System.out.println("Umur:" + umur);
        System.out.println("Jurusan:" + jurusan);
    }
}

// program utama
public class TestPewarisan_mod7 {
    public static void main(String args[]) {
        Manusia_mod7 orang1 = new Manusia_mod7();
        orang1.cetak();
        System.out.println();
        System.out.println();
        Mahasiswa_mod7 mhs1 = new Mahasiswa_mod7();
        mhs1.cetak();
    }
}


