package Monster;
import Vehicle.Vehicle;

public class Kaiju extends Monster implements IAbilities {

    public Kaiju(String name, int health, int attack) {
        super(name, health, attack);
    }

    public void fly() {
        increaseHealth(health / 5);
    }

    public void roar() {
        increaseAttack(attack / 5);
    }
}
