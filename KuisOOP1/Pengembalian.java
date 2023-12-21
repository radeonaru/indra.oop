import java.util.Date;

public class Pengembalian {

    private Peminjaman peminjaman;
    private Denda denda;
    private Date tanggalPengembalian;

   public Pengembalian(Peminjaman peminjaman, Denda denda, Date tanggalPengembalian) {
       this.peminjaman = peminjaman;
       this.denda = denda;
       this.tanggalPengembalian = tanggalPengembalian;
   }

   public Peminjaman getPeminjaman() {
       return peminjaman;
   }

   public void setPeminjaman(Peminjaman peminjaman) {
       this.peminjaman = peminjaman;
   }

   public Denda getDenda() {
       return denda;
   }

   public void setDenda(Denda denda) {
       this.denda = denda;
   }

   public Date getTanggalPengembalian() {
       return tanggalPengembalian;
   }

   public void setTanggalPengembalian(Date tanggalPengembalian) {
       this.tanggalPengembalian = tanggalPengembalian;
   }
}

