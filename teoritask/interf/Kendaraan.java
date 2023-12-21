package interf;

public class Kendaraan {
    private String merk;
    private String warna;
    private int tahun;

    Kendaraan(String merk, String warna, int tahun){
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    public void tampilInfoKendaraan(){
        System.out.println("===========================================");
        System.out.println("Merk\t\t: " + merk);
        System.out.println("Warna\t\t: " + warna);
        System.out.println("Tahun\t\t: " + tahun);
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getMerk() {
        return merk;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public String getWarna() {
        return warna;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    public int getTahun() {
        return tahun;
    }
}
