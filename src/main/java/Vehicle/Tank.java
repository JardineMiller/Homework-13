package Vehicle;

import Monster.Monster;

public class Tank extends Vehicle implements IMachineGun, ITurret {

    public Tank(String type, int health, int attack, int morale) {
        super(type, health, attack, morale);
    }

    public void machineGunAttack(Monster target) {
        target.takeDamage(attack);
    }

    public void turretShotAttack(Monster target) {
        target.takeDamage(attack * 2);
    }



}
