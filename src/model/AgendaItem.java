package model;

public class AgendaItem {

    private String tanggal;
    private String waktu;
    private String judul;
    private String deskripsi;
    private String kategori;
    private String status;
    private String prioritas;

    public AgendaItem(String tanggal, String waktu, String judul,
                      String deskripsi, String kategori,
                      String status, String prioritas) {
        this.tanggal = tanggal;
        this.waktu = waktu;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.kategori = kategori;
        this.status = status;
        this.prioritas = prioritas;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrioritas() {
        return prioritas;
    }

    public void setPrioritas(String prioritas) {
        this.prioritas = prioritas;
    }
}
