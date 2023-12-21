package minggu6;

public class PersegiPanjang extends BangunDatar{
    public float panjang;
    public float lebar;

    PersegiPanjang (float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    PersegiPanjang(){

    }

    @Override
    public float Keliling(){
        keliling = 2*(panjang+lebar);
        return keliling;
    }

        @Override
    public float Luas(){
        luas = panjang * lebar;
        return luas;
    }
}
