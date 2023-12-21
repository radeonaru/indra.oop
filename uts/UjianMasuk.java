package uts;

public class UjianMasuk {
    private String jenisUjian;
    
    public UjianMasuk(String jenisUjian) {
        this.jenisUjian = jenisUjian;
    }
    
    public void lakukanUjian(CalonMahasiswa mahasiswa) {
        System.out.println(mahasiswa.getNama() + " melakukan ujian berbasis " + jenisUjian + " di " + mahasiswa.getPerguruanTinggi().getNama());
    }
}
