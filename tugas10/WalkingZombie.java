package tugas10;

public class WalkingZombie extends Zombie{

    WalkingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }

    @Override
    public void destroyed() {
        health -= 2;
    }

    public void heal(){
        if (level == 1) {
            health += 20;
        }
        else if(level == 2){
            health += 30;
        }
        else if(level == 3){
            health += 40;
        }
    }

    public String getZombieInfo(){
        return "Walking Zombie\nZombie Level : " + level + "\nZombie Health : " + health;
    }
}
