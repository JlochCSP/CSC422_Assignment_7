package assignment_7;

import java.util.Random;

class Weapon {
	
	Random rand = new Random();
    private int damage;
    private int accuracy;
    private final String weaponName;

    String[] weapons = new String[] {
            "Shotgun", "Submachine Gun", "Assault Rifle",
            "Pistol", "Axe", "Crowbar", "Frying Pan"};

    Weapon() {
        int randGun = rand.nextInt(7);
        weaponName = weapons[randGun];
        
        switch (weaponName) {
            case "Shotgun":
                damage = 100;
                accuracy = 30;
                break;
            case "Submachine Gun":
                damage = 50;
                accuracy = 70;
                break;
            case "Assault Rifle":
                damage = 70;
                accuracy = 50;
                break;
            case "Pistol":
                damage = 25;
                accuracy = 80;
                break;
            case "Axe":
                damage = 50;
                accuracy = 100;
                break;
            case "Crowbar":
                damage = 20;
                accuracy = 100;
                break;
            case "Frying Pan":
                damage = 5;
                accuracy = 1;
                break;
        }
     }

    public int getDamage() {
        return damage;
     }

    public int getAccuracy() {
       return accuracy;
    }

    public String getWeaponName() {
       return weaponName;
    }

    public boolean checkAccuracy(int accuracy) {
        Random random = new Random();
        int compareAccuracy = random.nextInt(100);
        if(accuracy >= compareAccuracy) {
        	return true;
        } else {
        	return false;
        }
    }
}
