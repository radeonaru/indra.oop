public class Denda {

    private int hari;
    private int dendaHarian;


    public Denda(int hari, int dendaPerHari) {
        this.hari = hari;
        this.dendaHarian = dendaPerHari;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public int getDendaHarian() {
        return dendaHarian;
    }

    public void setDendaHarian(int dendaHarian) {
        this.dendaHarian = dendaHarian;
    }

    public int hitungTotalDenda() {
        return hari * dendaHarian;
    }
}
