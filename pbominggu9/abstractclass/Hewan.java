package pbominggu9.abstractclass;

public abstract class Hewan {
    private int umur;

    protected Hewan(){
        this.umur = 0;
    }

    public void bertambahUmur() {
        this.umur += 1;
    }

    public abstract void bergerak();
}
