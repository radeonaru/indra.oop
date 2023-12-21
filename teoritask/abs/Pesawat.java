public class Pesawat extends Kendaraan {
    public void menyalakan(){
        System.out.println("Pesawat Berhasil dinyalakan");
    }
    public void mematikan(){
        System.out.println("Pesawat Berhasil dimatikan");
    }
    public Pesawat (String merk, String warna, int tahun){
        super(merk, warna, tahun);
    }
}
