public class Mahasiswa_mod3 {
    private String nim, nama;

    // method mutator
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // method acessor
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public void TampilkanData() {
        System.out.println("==Data==");
        System.out.println("Nim : " + nim);
        System.out.println("Nama : " + nama);
    }
    public static void main(String args[]) {
        Mahasiswa_mod3 obj = new Mahasiswa_mod3();
        obj.setNim("175410001");
        obj.setNama("Azkiya");

        obj.TampilkanData();
    
    }
}


