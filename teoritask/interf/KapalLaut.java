package interf;

public class KapalLaut extends Kendaraan implements IRadar, IGps{
    String jenisRadar, jenisGps;
    int maxRadar, accrGps;


    public void menyalakan(){
        System.out.println("Kapal Laut berhasil dinyalakan");
    }
    public void mematikan(){
        System.out.println("Kapal Laut berhasil dimatikan");
    }

    public void setJenisRadar(String jenisRadar){
        this.jenisRadar = jenisRadar;
    }

    public String getJenisRadar(){
        return this.jenisRadar;
    }

    public void setMaximumRange(int maxRadar){
        this.maxRadar = maxRadar;
    }

    public int getMaximumRange(){
        return this.maxRadar;
    }

    public KapalLaut (String merk, String warna, int tahun){
        super(merk, warna, tahun);
    }

    public void tampilInfoRadar(){
        System.out.println("Jenis Radar\t: " + getJenisRadar());
        System.out.println("Maximum Radar\t: " + getMaximumRange() + " km");
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
