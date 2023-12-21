package tugas10;

public class JumpingZombie extends Zombie{

    JumpingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }
    
    @Override
    public void destroyed() {
        health -= 1;
    }

    public void heal(){
        if (level == 1) {
            health += 30;
        }
        else if(level == 2){
            health += 40;
        }
        else if(level == 3){
            health += 50;
        }
    }

    public String getZombieInfo(){
        return "Jumping Zombie\nZombie Level : " + level + "\nZombie Health : " + health;
    }
}
