package Jobsheet2;

public class Barang {
    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual(){
        int hargajual = (int) (hargaDasar - ((diskon/100) * hargaDasar));
        return hargajual;
    }

    public void tampilData(){
        System.out.println("Kode : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : " + hargaDasar);
        System.out.println("Diskon : " + diskon + "%");
        System.out.println("Harga Jual : " + hitungHargaJual());
    }
}
