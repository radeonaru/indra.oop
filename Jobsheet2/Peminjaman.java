package Jobsheet2;

public class Peminjaman {
    public int id, lamaSewa, hargaSewa;
    public String namaMember, namaGame;
    public float harga;

    public void showInfo() {
        System.out.println("ID Member : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game : " + namaGame);
        System.out.println("Harga Sewa : " + hargaSewa + "/hari");
        System.out.println("Lama Sewa : " + lamaSewa + " hari");
    }

    public void totalPembayaran() {
        float totalHarga = hargaSewa * lamaSewa;
        System.out.println("Total Pembayaran : " + totalHarga);
    }

}
