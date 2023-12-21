package MuhammadBagusIndra.relasiclass.percobaan2;

public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    Pelanggan(){

    }

    public int getHari() {
        return hari;
    }
    public Mobil getMobil() {
        return mobil;
    }
    public String getNama() {
        return nama;
    }
    public Sopir getSopir() {
        return sopir;
    }
    public void setHari(int hari) {
        this.hari = hari;
    }
    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }

    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
}
