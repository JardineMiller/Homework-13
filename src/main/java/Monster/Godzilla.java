package Monster;

import Vehicle.Vehicle;

public class Godzilla extends Monster implements IAbilities {

    public Godzilla(String name, int health, int attack) {
        super(name, health, attack);
    }

    public void fly() {
        increaseHealth(health / 10);
    }

    public void roar() {
        increaseAttack(attack / 10);
    }


}
