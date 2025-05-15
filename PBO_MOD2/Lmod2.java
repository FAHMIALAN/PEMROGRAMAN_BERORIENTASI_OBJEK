class Lmod2 {
    String judul;
    int harga;
    int halaman;
    String penerbit;
    String pengarang;
    String bahasa;
    String status;

    public void setLmod2(String judul, int harga, int halaman,
            String pengarang, String penerbit, String bahasa,
            String status) {
        this.judul = judul;
        this.harga = harga;
        this.halaman = halaman;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.bahasa = bahasa;
        this.status = status;
    }

    public void tampil() {
        System.out.println("Judul buku: " + judul);
        System.out.println("Harga buku: " + harga);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Nama Pengarang: " + pengarang);
        System.out.println("Nama Penerbit: " + penerbit);
        System.out.println("Bahasa: " + bahasa);
        System.out.println("Status: " + status);
    }
}
