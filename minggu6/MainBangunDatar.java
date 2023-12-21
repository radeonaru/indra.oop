package minggu6;

public class MainBangunDatar {
    public static void main(String[] args) {
    Lingkaran lingkaran = new Lingkaran();
    Segitiga segitiga = new Segitiga();
    PersegiPanjang persegiPanjang = new PersegiPanjang();

    lingkaran.r = 10;

    segitiga.alas = 10;
    segitiga.tinggi = 2;

    persegiPanjang.panjang = 10;
    persegiPanjang.lebar = 4;

    System.out.println("Keliling Lingkaran : " + lingkaran.Keliling());
    System.out.println("Luas Lingkaran : " + lingkaran.Luas());

    System.out.println("Keliling Segitiga Sama Kaki : " + segitiga.Keliling());
    System.out.println("Luas Segitiga Sama Kaki: " + segitiga.Luas());

    System.out.println("Keliling Persegi Panjang : " + persegiPanjang.Keliling());
    System.out.println("Luas Persegi Panjang : " + persegiPanjang.Luas());
    }
    
}
