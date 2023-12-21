package MuhammadBagusIndra.relasiclass.percobaan4;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    private void initKursi(){
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i));
        }
    }

    Gerbong(String kode, int jumlah){
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    public String info(){
        String info = " ";
        info += "Kode: " + kode +"\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }

    public void setPenumpang(Penumpang penumpang, int nomor){
        if (arrayKursi[nomor-1].getPenumpang() == null) {
        this.arrayKursi[nomor-1].setPenumpang(penumpang);
        } else {
        System.out.println("Kursi ini telah ditempati oleh Penumpang lain!");
        }
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getKode() {
        return kode;
    }
    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }
}
