package assignment_7;

class Child extends Survivor{
	
	public Child(int id) {
        this.id = id;
        health = 20;
        attack = 2;
        name = "Child";
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
    public void attack(Zombie zombie, int attack) {
        zombie.setHealth(attack);
    }
    @Override
     public String getName(){
        return name + " " + id;
    }
}
