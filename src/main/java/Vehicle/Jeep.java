package Vehicle;
import Monster.Monster;

public class Jeep extends Vehicle implements IMachineGun {

    public Jeep(String type, int health, int attack, int morale) {
        super(type, health, attack, morale);
    }

    public void machineGunAttack(Monster target) {
        target.takeDamage(attack);
    }

}
