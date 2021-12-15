package assignment_7;

class CommonInfected extends Zombie {

	public CommonInfected(int id) {
		this.id = id;
		health = 30;
		attack = 5;
		name = "CommonInfected";
	}

	@Override
	protected int getID() {
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

	@Override
	public void attack(Survivor survivor, int attack) {
		survivor.setHealth(attack);
	}

	@Override
	public String getName() {
		return name + " " + id;
	}
}
