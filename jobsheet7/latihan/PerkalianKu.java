package jobsheet7.latihan;

public class PerkalianKu {
    void perkalian(int a, int b){
        System.out.println(a * b);
    }

    void perkalian(int a, int b, int c){
        System.out.println(a * b * c);
    }

    public static void main(String[] args) {
        PerkalianKu objek = new PerkalianKu();

        objek.perkalian(25, 43);
        objek.perkalian(34, 23, 56);
    }
}

// public class PerkalianKu {
//     void perkalian(int a, int b){
//         System.out.println(a * b);
//     }

//     void perkalian(double a, double b){
//         System.out.println(a * b * c);
//     }

//     public static void main(String[] args) {
//         PerkalianKu objek = new PerkalianKu();

//         objek.perkalian(25, 43);
//         objek.perkalian(34.56, 23.7);
//     }
// }