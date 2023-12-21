package Jobsheet2;

public class Lingkaran {
    double phi = 3.14;
    double r;

    public void hitungLuas() {
        double luas = phi*r*r;
        System.out.println("Luas Lingkaran : " + luas + " cm^2");
    }
    public void hitungKeliling() {
        double keliling = 2*phi*r;
        System.out.println("Keliling Lingkaran : " + keliling + " cm");
    }

}
