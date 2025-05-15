class handphone {
    String nama_iphone;
    int nomor;
    String warna_hp;

    public void sethandphone(String nama_iphone, String warna_hp, int nomor) {
        this.nama_iphone = nama_iphone;
        this.warna_hp = warna_hp;
        this.nomor = nomor;
    }

    public void tampil() {
        System.out.println("Nama Merk HP :" + nama_iphone);
        System.out.println("Warna HP :" + warna_hp);
        System.out.println("Nomor hp :" + nomor);
    }
}



