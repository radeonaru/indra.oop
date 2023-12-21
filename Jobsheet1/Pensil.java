package Jobsheet1;

public class Pensil {
    String warna;
    double panjang;
    boolean tajam;

    void tulis(String teks) {
        System.out.println("Menulis: " + teks);
    }

    void raut() {
        tajam = true;
        System.out.println("Pensil telah diasah.");
    }

    void gantiWarna(String warnaBaru) {
        warna = warnaBaru;
        System.out.println("Warna pensil diganti menjadi: " + warna);
    }

    void cetakStatus(){
        System.out.println("\nInformasi Pensil:");
        System.out.println("Warna: " + warna);
        System.out.println("Panjang: " + panjang + " cm");
        System.out.println("Tajam: " + (tajam ? "Ya" : "Tidak"));
    }
}
