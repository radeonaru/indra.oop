package pbominggu9.interfacelatihan;

public class Mahasiswa {
    protected String nama;

    public Mahasiswa(String nama){
        this.nama = nama;
    }

    public void kuliahDiKampus(){
        System.out.println("Aku mahasiswa, namaku " + this.nama);
        System.out.println("Aku Berkuliah di kampus.");
    }
}
