package jobsheet7.tugas;

public class Sudut {
    public int sudut;
    public int keliling;

    public int totalSudut(int sudutA){
        return sudut = 180-sudutA;
    }

    public int totalSudut(int sudutA, int sudutB){
        return sudut = 180-(sudutA+sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC){
        int c = sisiA + sisiB + sisiC;
        return c;
    }

    public double keliling(int sisiA, int sisiB){
        double c = Math.sqrt((sisiA*sisiA) + (sisiB*sisiB));
        return c;
    }
}
