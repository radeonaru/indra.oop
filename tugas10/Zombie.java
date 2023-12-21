package tugas10;

public class Zombie implements Destroyable{
    protected int health;
    protected int level;

        @Override
        public void destroyed() {
            
        }

        public void heal(){

        }

        public String getZombieInfo(){
            return "Zombie Level : " + level + "\nZombie Health : " + health;
        }
}
