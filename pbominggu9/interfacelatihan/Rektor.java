package pbominggu9.interfacelatihan;

public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya rektor, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! bagaimana anda bisa cumlaude?");

        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("--------------------------------------------");
    }

    public void beriSetifikatMawapres(IBerprestasi mahasiswa){
        System.out.println("Saya REKTOR, memberikan serifikat MAWAPRES.");
        System.out.println("Selamat! bagaimana anda bisa berprestasi?");

        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();

        System.out.println("--------------------------------------------");
    }
}
