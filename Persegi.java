public class Persegi {
    float sisi;
    float keliling;
    float luas;

    public void dataPersegi(float s) {
        sisi = s;
        System.out.println("Panjang Sisi: " + sisi + "cm");
    }

    public void luasPersegi() {
        System.out.println("Luas Persegi: " + (sisi*sisi) + "cm^2");
    }

    public void kelilingPersegi() {
        System.out.println("Keliling Persegi: " + (4*sisi) + "cm");
    }
}
