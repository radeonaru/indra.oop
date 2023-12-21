public class Mobil extends Kendaraan{ 
    public void menyalakan(){
        System.out.println("Mobil Berhasil dinyalakan");
    }

    public void mematikan(){
        System.out.println("Mobil Berhasil dimatikan");
    }
    public Mobil (String merk, String warna, int tahun){
        super(merk, warna, tahun);
    }
}
