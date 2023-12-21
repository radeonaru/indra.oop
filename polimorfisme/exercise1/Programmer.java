package polimorfisme.exercise1;

public class Programmer extends Pegawai{
    private int bonus;

    Programmer(String nama, int gaji, int bonus){
        this.nama = nama;
        this.gaji = gaji;
        this.bonus = bonus;
    }

    @Override
    public int getGaji() {
        return super.getGaji();
    }

    public int getBonus() {
        return bonus;
    }
}
