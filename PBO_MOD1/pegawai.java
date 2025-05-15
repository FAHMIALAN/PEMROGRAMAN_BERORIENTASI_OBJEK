class pegawai {
    String nama_pegawai;
    String nomor_pegawai;

    public void setpegawai(String nama_pegawai, String nomor_pegawai) {
        this.nama_pegawai = nama_pegawai;
        this.nomor_pegawai = nomor_pegawai;
    }

    public void tampil() {
        System.out.println("Nama Pegawai :" + nama_pegawai);
        System.out.println("Nomor Pegawai :" + nomor_pegawai);
    }
}
