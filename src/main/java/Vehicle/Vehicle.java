package Vehicle;

public abstract class Vehicle {
    protected String type;
    protected int health;
    protected int attack;
    protected int morale;
    protected boolean alive;

    public Vehicle(String type, int health, int attack, int morale) {
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.morale = morale;
        this.alive = true;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getMorale() {
        return morale;
    }

    public boolean isAlive() {
        return alive;
    }

    public void takeDamage(int amount) {
        this.health -= amount;
        if(this.health <= 0) {
            this.alive = false;
        }
    }
}
