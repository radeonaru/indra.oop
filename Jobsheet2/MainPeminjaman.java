package Jobsheet2;

public class MainPeminjaman {
    public static void main(String[] args) {
        Peminjaman pjm = new Peminjaman();
        pjm.id = 1002;
        pjm.namaMember = "Lithia";
        pjm.namaGame = "Final Fantasy 7 Remake";
        pjm.lamaSewa = 7;
        pjm.hargaSewa = 6000;

        pjm.showInfo();
        pjm.totalPembayaran();
    }
}
