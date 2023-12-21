package MuhammadBagusIndra.relasiclass.percobaan2;

public class Sopir {
    private String nama;
    private int biaya;

    Sopir(){

    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getBiaya() {
        return biaya;
    }
    public String getNama() {
        return nama;
    }

    public int hitungBiayaSopir(int hari){
        return biaya*hari;
    }
}
