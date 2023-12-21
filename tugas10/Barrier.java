package tugas10;

public class Barrier implements Destroyable{
    private int strength;

    Barrier(int strength){
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {
        strength -= 3;
    }

    public String getBarrierInfo(){
        return "Barrier : " + strength;
    }
}
