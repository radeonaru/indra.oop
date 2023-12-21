public class MainAbstrak {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota Avanza", "Hitam", 2020);
        Motor motor1 = new Motor("Supra X 125", "Pink", 2010);
        KapalLaut kapal1 = new KapalLaut("Kapal Api", "Merah", 1999);
        Pesawat pesawat1 = new Pesawat("Boeing 737 ", "Putih", 2011);

        mobil1.menyalakan();
        mobil1.tampilInfo();
        mobil1.mematikan();
        System.out.println("");

        motor1.menyalakan();
        motor1.tampilInfo();
        motor1.mematikan();
        System.out.println("");

        kapal1.menyalakan();
        kapal1.tampilInfo();
        kapal1.mematikan();
        System.out.println("");

        pesawat1.menyalakan();
        pesawat1.tampilInfo();
        pesawat1.mematikan();
        System.out.println("");
    }
}
