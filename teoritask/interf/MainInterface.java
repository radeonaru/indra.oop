package interf;

public class MainInterface {
    public static void main(String[] args) {
        KapalLaut kapalLaut1 = new KapalLaut("Kapal Api", "Merah", 1999);
        kapalLaut1.setJenisRadar("Radar Perang");
        kapalLaut1.setMaximumRange(100);
        kapalLaut1.setJenisGPS("kpl");
        kapalLaut1.setTingkatAkurasi(3);
        kapalLaut1.tampilInfoKendaraan();
        kapalLaut1.tampilInfoRadar();
        kapalLaut1.tampilInfoGps();

        Pesawat pesawatTempur1 = new Pesawat("Sukhoi", "Abu-Abu", 2000);
        pesawatTempur1.setJenisRadar("Radar Tempur");
        pesawatTempur1.setMaximumRange(50);
        pesawatTempur1.setJenisGPS("Psw");
        pesawatTempur1.setTingkatAkurasi(2);
        pesawatTempur1.tampilInfoKendaraan();
        pesawatTempur1.tampilInfoRadar();
        pesawatTempur1.tampilInfoGps();

        Mobil mobil1 = new Mobil("Mustang GT", "Merah", 2010);
        mobil1.setJenisGPS("Uhuy");
        mobil1.setTingkatAkurasi(10);
        mobil1.tampilInfoKendaraan();
        mobil1.tampilInfoGps();

        Motor motor1 = new Motor("Supra Bapak", "Pink", 2023);
        motor1.setJenisGPS("Anjay");
        motor1.setTingkatAkurasi(5);
        motor1.tampilInfoKendaraan();
        motor1.tampilInfoGps();

    }
}
