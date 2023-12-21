package Jobsheet2;

public class MainBarang {
    public static void main(String[] args) {
        Barang brg = new Barang();
        brg.kode = "A003";
        brg.namaBarang = "Stella Jeruk";
        brg.hargaDasar = 75000;
        brg.diskon = 5;

        brg.tampilData();
    }
}
