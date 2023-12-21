package koperasiencapjs3;
import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        char ulang;
        int menu;

        do {
            donny.tampilMenu();
            System.out.print("=> ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan jumlah pinjaman : ");
                    int jumlah = sc.nextInt();
                    donny.pinjam(jumlah);
                    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                    break;
                case 2:
                    System.out.print("Masukkan jumlah angsuran :");
                    int bayar = sc.nextInt();
                    donny.angsur(bayar);
                    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                    break;
                case 3:

                    return;
                default:
                System.out.println("Menu yang anda masukkan tidak valid");
                    break;
            }
            System.out.println("Ulangi program? (y/n)");
            ulang = sc.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');

        // System.out.println("Nama Anggota: " + donny.getNama());
        // System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        // System.out.println("\nMeminjam uang 10.000.000...");
        // donny.pinjam(10000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        // System.out.println("\nMeminjam uang 4.000.000...");
        // donny.pinjam(4000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        // System.out.println("\nMengangsur pinjaman 1.000.000...");
        // donny.angsur(1000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        // System.out.println("\nMengangsur pinjaman 3.000.000...");
        // donny.angsur(3000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
    }
}
