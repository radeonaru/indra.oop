package polimorfisme.exercise1;

public class Manajer extends Pegawai{
    private int tunjangan;

    Manajer(String nama, int gaji, int tunjangan){
        this.nama = nama;
        this.gaji = gaji;
        this.tunjangan = tunjangan;
    }

    @Override
    public int getGaji() {
        return super.getGaji();
    }

    public int getTunjangan() {
        return tunjangan;
    }
}
