public class Motor extends Kendaraan {
    public void menyalakan(){
        System.out.println("Motor Berhasil dinyalakan");
    }

    public void mematikan(){
        System.out.println("Motor Berhasil dimatikan");
    }
    public Motor (String merk, String warna, int tahun){
        super(merk, warna, tahun);
    }
}
