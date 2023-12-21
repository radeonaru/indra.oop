public class KapalLaut extends Kendaraan{
    public void menyalakan(){
        System.out.println("Kapal Laut berhasil dinyalakan");
    }
    public void mematikan(){
        System.out.println("Kapal Laut berhasil dimatikan");
    }
    public KapalLaut (String merk, String warna, int tahun){
        super(merk, warna, tahun);
    }
}
