package Jobsheet1;

public class Demo {
    public static void main(String[] args) {

        Matic matic = new Matic();
        matic.merek = "Avanza";
        matic.warna = "Putih";
        matic.roda = 4;
        matic.kecepatan = 0;
        matic.transmisi = "Matic";

        Manual manual = new Manual();
        manual.merek = "Supra";
        manual.warna = "Biru";
        manual.roda = 2;
        manual.kecepatan = 0;
        manual.transmisi = "Manual";


        Buku buku = new Buku();
        buku.judul = "Goblin Slayer";
        buku.penulis = "Kumo Kagyu";
        buku.jumlahHalaman = 256;

        Pensil pensil = new Pensil();
        pensil.warna = "Hitam";
        pensil.panjang = 13.0;
        pensil.tajam = true;

        
        Kendaraan kendaraan = new Kendaraan("Mobil","Civic", "Biru", 4, 0, "Manual", 0);

        matic.startEngine();
        matic.accelerate(60);

        System.out.println();
        manual.startEngine();
        manual.tambahKopling();
        manual.accelerate(25);
        manual.tambahKopling();
        manual.accelerate(30);
        manual.tambahKopling();

        System.out.println();
        kendaraan.startEngine();
        kendaraan.tambahKopling();
        kendaraan.accelerate(30);
        kendaraan.tambahKopling();
        kendaraan.accelerate(35);
        System.out.println();
        buku.baca();
        System.out.println();
        pensil.tulis("Nama saya Muhammad Bagus Indrawan.");
        System.out.println();

        matic.cetakStatus();
        System.out.println();
        manual.cetakStatus();
        System.out.println();
        buku.cetakStatus();
        System.out.println();
        pensil.cetakStatus();
        System.out.println();
        kendaraan.cetakStatus();
    }
}
