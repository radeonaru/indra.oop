package minggu6;

public class Segitiga extends BangunDatar{
    public float alas;
    public float tinggi;

    Segitiga(float alas, float tinggi){

    }

    Segitiga(){

    }

    @Override
    public float Keliling(){
        float sisimiring = (float) Math.sqrt((tinggi*tinggi) + ((alas/2)*(alas/2)));
        keliling = alas + (sisimiring*2);
        return keliling;
    }
    @Override
    public float Luas(){
        luas = alas*tinggi/2;
        return luas;
    }
}
