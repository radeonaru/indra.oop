import java.util.Date;

public class Peminjaman {
    
    private Buku buku;
    private Katalog katalog;
    private Date tanggalPinjam;
    private Date tanggalKembali;

    public Peminjaman(Buku buku, Katalog katalog, Date tanggalPinjam, Date tanggalKembali) {
        this.buku = buku;
        this.katalog = katalog;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Katalog getKatalog() {
        return katalog;
    }

    public void setKatalog(Katalog katalog) {
        this.katalog = katalog;
    }

    public Date getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(Date tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }
}
