package Jobsheet2;

public class MainLingkaran {
    public static void main(String[] args) {
        Lingkaran lgkr1 = new Lingkaran();
        lgkr1.r = 10;
        System.out.println("Panjang jari-jari : " + lgkr1.r + " cm");
        lgkr1.hitungKeliling();
        lgkr1.hitungLuas();
    }
}
