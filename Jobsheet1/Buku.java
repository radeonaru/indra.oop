package Jobsheet1;

public class Buku {
    String judul;
    String penulis;
    int jumlahHalaman;

    void baca() {
        System.out.println("Sedang membaca buku: " + judul);
    }

    void tutupBuku() {
        System.out.println("Buku ditutup.");
    }

    void cariHalaman(int halaman) {
        System.out.println("Mencari halaman " + halaman);
    }

    void cetakStatus(){
        System.out.println("\nInformasi Buku:");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
    }
}
