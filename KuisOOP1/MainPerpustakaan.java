import java.util.ArrayList;
import java.util.Scanner;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Perpustakaan perpus = new Perpustakaan();
        char ulang;

        //Isi Dummy Buku disini
        ArrayList<Buku> novel = new ArrayList<Buku>();
        novel.add(new Buku("Laskar Pelangi", "Andrea Hirata", "Bentang Pustaka", 2005));
        novel.add(new Buku("Negeri 5 Menara", "A. Fuadi", "Gramedia Pustaka Utama", 2009));
        Katalog katalog1 = new Katalog("Novel Indonesia", novel);



        System.out.println("=========================================");
        System.out.println("|     Sistem Manajemen Perpustakaan\t|");
        System.out.println("=========================================");

        do{
        perpus.TampilMenu();
        System.out.println("=========================================");
        System.out.println("* Pilih Menu : ");
        
        int pilih = sc.nextInt();
        switch (pilih) {
            case 1:
                
                break;

            case 2:
                katalog1.tampilSemuaBuku();
                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;

            case 6:

                return;
        
            default:
                break;
        }
        System.out.println("Ulangi Menu? (Y/T)");
        System.out.print("=> ");
        ulang = sc.next().charAt(0);
    } while (ulang == 'Y' || ulang == 'y');

    }
}
