package interf;

public class Motor extends Kendaraan implements IGps {
    String jenisGps;
    int accrGps;

    public void menyalakan(){
        System.out.println("Motor Berhasil dinyalakan");
    }

    public void mematikan(){
        System.out.println("Motor Berhasil dimatikan");
    }
    
    public Motor (String merk, String warna, int tahun){
        super(merk, warna, tahun);
    }

    public String getJenisGPS(){
        return this.jenisGps;
    };
    public void setJenisGPS(String jenisGps){
        this.jenisGps = jenisGps;
    };
    public void setTingkatAkurasi(int accrGps){
        this.accrGps = accrGps;
    };
    public int getTingkatAkurasi(){
        return this.accrGps;
    };

    public void tampilInfoGps(){
        System.out.println("Jenis GPS\t: " + getJenisGPS());
        System.out.println("Tingkat Akurasi\t: " + getTingkatAkurasi() + " m");
    }
}
