package minggu6;

public class Lingkaran extends BangunDatar{
    public float r;

    Lingkaran (float r){
        this.r = r;
    }

    Lingkaran(){

    }

    @Override
    public float Keliling(){
        keliling = 2*3.14f*r;
        return keliling;
    }

    @Override
    public float Luas(){
        luas = 3.14f*r*r;
        return luas;
    }
}
