package Jobsheet10;

public class WalkingZombie1841720206Kaisar extends Zombie1841720206Kaisar {

    public WalkingZombie1841720206Kaisar(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void healKaisarKaisar() {
        switch(this.level){
            case 1: this.health += (20/100 * this.health);break;
            case 2: this.health += (30/100 * this.health);break;
            case 3: this.health += (40/100 * this.health);break;
        }
    }

    @Override
    public void destroyedKaisar() {
        this.health -= (20 * this.health / 100);
    }

    @Override
    public String getZombieInfoKaisar() {
        String info = super.getZombieInfoKaisar();
        return "Walking Zombie Data = \n"
        + info;
    }
    
    
    
}
