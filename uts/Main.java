package uts;

public class Main {
    public static void main(String[] args) {
        PerguruanTinggi polinema = new PerguruanTinggiVokasi("Polinema");
        PerguruanTinggi universitasIndonesia = new PerguruanTinggiAkademik("Universitas Indonesia");
        
        CalonMahasiswa budi = new CalonMahasiswa("Budi", polinema);
        CalonMahasiswa toni = new CalonMahasiswa("Toni", universitasIndonesia);

        int nilaiBudi = 75;
        int nilaiToni = 81;

        PassingGradePolinema passingGradePolinema = new PassingGradePolinema();
        PassingGradeUniversitasIndonesia passingGradeUniversitasIndonesia = new PassingGradeUniversitasIndonesia();
        
        UjianMasuk ujianBudi = new UjianKomputer();
        UjianMasuk ujianToni = new UjianTulis();
        
        Pengumuman Pengumuman = new Pengumuman();
        
        if (budi.getPerguruanTinggi() instanceof PerguruanTinggiVokasi) {
            budi.daftarPerguruanTinggi();
            ujianBudi.lakukanUjian(budi);
            if (((PassingGradePolinema) passingGradePolinema).lulus(nilaiBudi)) {
                System.out.println("Hasil ujian " + budi.getNama() + " memenuhi passing grade Polinema"); 
            } else {
                System.out.println("Hasil ujian " + budi.getNama() + " tidak memenuhi passing grade Polinema"); 
            }
            Pengumuman.lihatPengumuman(budi, true);
        }
        
        if (toni.getPerguruanTinggi() instanceof PerguruanTinggiAkademik) {
            toni.daftarPerguruanTinggi();
            ujianToni.lakukanUjian(toni);
            if (((PassingGradeUniversitasIndonesia) passingGradeUniversitasIndonesia).lulus(nilaiToni)) {
                System.out.println("Hasil ujian " + toni.getNama() + " memenuhi passing grade Universitas Indonesia"); 
            } else {
                System.out.println("Hasil ujian " + toni.getNama() + " tidak memenuhi passing grade Universitas Indonesia"); 
            }
            Pengumuman.lihatPengumuman(toni, false);
        }
    
    }
}
