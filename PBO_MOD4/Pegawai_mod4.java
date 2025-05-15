
public class Pegawai_mod4 {

    String NamaPegawai;
    int IdPegawai;
    String PosisiPegawai;

    Pegawai_mod4(String nama, int Id, String posisi) // konstruktor
    {
        NamaPegawai = nama;
        IdPegawai = Id;
        PosisiPegawai = posisi;
    }

    Pegawai_mod4() //konstruktor
    {
        NamaPegawai = "Azkiya";
        IdPegawai = 2514;
        PosisiPegawai = "Staf pengajar";
    }

    void Show() {
        System.out.println("Informasi Pegawai");
        System.out.println("Nama : " + NamaPegawai);
        System.out.println("Id : " + IdPegawai);
        System.out.println("Posisi : " + PosisiPegawai);
    }

    public static void main(String args[]) {
        Pegawai_mod4 pegawai1 = new Pegawai_mod4();
        Pegawai_mod4 pegawai2 = new Pegawai_mod4("Zahwa", 3313, "Staf Akademik");
        pegawai1.Show();
        pegawai2.Show();
    }
}
