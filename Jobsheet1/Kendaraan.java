package Jobsheet1;

public class Kendaraan extends Manual{
    Matic matic;
    String jenis;

    Kendaraan(String jenis, String merek, String warna, int roda, int kecepatan, String transmisi, int kopling) {
        this.jenis = jenis;
        this.merek = merek;
        this.warna = warna;
        this.roda = roda;
        this.kecepatan = kecepatan;
        this.transmisi = transmisi;
        this.kopling = kopling;
    }

    void cetakStatus(){
        System.out.println("\nInformasi Kendaraan:");
        System.out.println("Jenis Kendaraan: " + jenis);
        System.out.println("Merek Kendaraan: " + merek);
        System.out.println("Warna Kendaraan: " + warna);
        System.out.println("Jumlah Roda: " + roda);
        System.out.println("Kecepatan Kendaraan: " + kecepatan + " km/jam");
        System.out.println("Jenis Transmisi: " + transmisi);
        System.out.println("Posisi Transmisi: " + kopling);
    }
}
