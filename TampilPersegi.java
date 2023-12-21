import java.util.Scanner;
public class TampilPersegi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persegi psg = new Persegi();

        System.out.print("Masukkan sisi Persegi : ");
        float sisi = sc.nextFloat();
        System.out.println();
        psg.dataPersegi(sisi);
        psg.kelilingPersegi();
        psg.luasPersegi();
    }
}
