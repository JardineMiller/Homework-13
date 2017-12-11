package Monster;
import Vehicle.Vehicle;
import City.City;

public abstract class Monster {

    protected String name;
    protected int health;
    protected int attack;
    protected boolean alive;
    protected int maxHealth;

    public Monster(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.alive = true;
        this.maxHealth = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
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

    public void attack(Vehicle target) {
        target.takeDamage(attack);
    }

    public void increaseHealth(int amount) {
        this.health += amount;
        if(this.health > maxHealth) {
            this.health = maxHealth;
        }
    }

    public void increaseAttack(int amount) {
        this.attack += amount;
    }

    public void destroyBuilding(City city) {
        city.destroyBuilding();
    }

}
