package uts;

public class CalonMahasiswa {
    private String nama;
    private PerguruanTinggi perguruanTinggi;
    
    public CalonMahasiswa(String nama, PerguruanTinggi perguruanTinggi) {
        this.nama = nama;
        this.perguruanTinggi = perguruanTinggi;
    }
    
    public String getNama() {
        return nama;
    }
    
    public PerguruanTinggi getPerguruanTinggi() {
        return perguruanTinggi;
    }

    public void daftarPerguruanTinggi(){
        System.out.println(nama + " mendaftar di " + perguruanTinggi.getNama());
    }

}
