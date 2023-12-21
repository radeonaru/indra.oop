import java.util.ArrayList; //meng-import kelas array list

//membuat kelas rak
public class Katalog {
    //atribut
    private ArrayList<Buku> listBuku; //array list dari objek buku
    private String namaKatalog;

    //konstruktor
    public Katalog(int kapasitas) {
        listBuku = new ArrayList<Buku>(kapasitas);
    }

    public Katalog(String namaKatalog, ArrayList<Buku> listBuku) {
        this.namaKatalog = namaKatalog;
        this.listBuku = listBuku;
    }

    public void tambahBuku(Buku buku) {
        listBuku.add(buku);
    }

   public void hapusBuku(String judul) {
       for (int i = 0; i < listBuku.size(); i++) {
           if (listBuku.get(i).getJudul().equals(judul)) {
               listBuku.remove(i);
               break;
           }
       }
   }

   public Buku cariBuku(String judul) {
       for (Buku buku : listBuku) {
           if (buku.getJudul().equals(judul)) {
               return buku;
           }
       }
       return null;
   }

   public void tampilSemuaBuku() {
        System.out.println("=> Katalog : " + namaKatalog + " <=\n");
       for (Buku buku : listBuku) {
           System.out.println("Judul : " + buku.getJudul() + " (" + buku.getTahunTerbit() + ")\nPenulis : " + buku.getPenulis() + "\nPenerbit : " + buku.getPenerbit() + "\n");
       }
   }
}
