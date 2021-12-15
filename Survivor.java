package assignment_7;

abstract class Survivor implements ICharacters{
	
	int id;
    int health;
    int attack;
    boolean isDead;
    String name;

    // @return 
    protected int getID(){
        return id;
    }

    
    
    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public void setHealth(int attack) {
        this.health = health - attack;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    /**
     * @param zombie
     * @param attack 
     */
    public void attack(Zombie zombie, int attack) {
        zombie.setHealth(attack);
    }

    
    @Override
    public void isDead(int health) {
        if (health <= 0) {
            isDead = true;
        }
    }
    
    public String getName(){
        return name + " " + id;
    }
        
}
