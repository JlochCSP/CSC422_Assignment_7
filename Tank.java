package assignment_7;

class Tank extends Zombie{
	
	public Tank(int id) {
        this.id = id;
        health = 150;
        attack = 20;
        name = "Tank";
    }

    @Override
    protected int getID() {
        return id;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int attack) {
        this.health = health - attack;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public void attack(Survivor survivor, int attack) {
        survivor.setHealth(attack);
    }
    
    @Override
    public String getName() {
        return name + " " + id;
    }
}
