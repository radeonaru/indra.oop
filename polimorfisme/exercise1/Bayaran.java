package polimorfisme.exercise1;

public class Bayaran {
    public int hitungBayaran(Pegawai pg){
        int uang = pg.getGaji();

        if (pg instanceof Manajer) {
            uang += ((Manajer)pg).getTunjangan();
        }
        else if (pg instanceof Manajer) {
            uang += ((Programmer)pg).getBonus();
        }
        return uang;
    }
}
