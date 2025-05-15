class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    int semester;
    String universitas;

    public void setMahasiswa(String nama, String nim,
            String jurusan, int semester, String universitas) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.semester = semester;
        this.universitas = universitas;
    }

    public void tampil() {
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Semester: " + semester);
        System.out.println("Universitas: " + universitas);
    }
}
