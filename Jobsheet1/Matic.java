package Jobsheet1;

public class Matic {
    String merek;
    String warna;
    int roda;
    String transmisi;
    int kecepatan;

    void startEngine() {
        System.out.println("Mesin kendaraan dinyalakan.");
    }

    void stopEngine() {
        System.out.println("Mesin kendaraan dimatikan.");
    }

    void accelerate(int speed) {
        kecepatan += speed;
        System.out.println("Kecepatan Kendaraan "+ merek + " sekarang: " + kecepatan + " km/jam");
    }

    void cetakStatus(){
        System.out.println("Informasi Kendaraan:");
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Jumlah Roda: " + roda);
        System.out.println("Kecepatan Sekarang: " + kecepatan + " km/jam");
    }
}
