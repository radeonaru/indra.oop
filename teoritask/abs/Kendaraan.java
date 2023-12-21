abstract class Kendaraan {
    private String merk;
    private String warna;
    private int tahun;
    public abstract void menyalakan();
    public abstract void mematikan();

    

    Kendaraan(String merk, String warna, int tahun){
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    public void tampilInfo(){
        System.out.println("=================================");
        System.out.println("Merk\t: " + merk);
        System.out.println("Warna\t: " + warna);
        System.out.println("Tahun\t: " + tahun);
        System.out.println("=================================");

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
