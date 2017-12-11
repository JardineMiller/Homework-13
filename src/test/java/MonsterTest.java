import Monster.*;
import Vehicle.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.assertEquals;

public class MonsterTest {
    Godzilla monster;
    Tank vehicle;
    Tank superTank;

    @Before
    public void before() {
        monster = new Godzilla("Barney", 1000, 200);
        vehicle = new Tank("Tank", 220, 50, 10);
        superTank = new Tank("Tank", 1000, 1000, 100);
    }

    @Test
    public void monsterHasEverything() {
        assertEquals("Barney", monster.getName());
        assertEquals(1000, monster.getHealth());
        assertEquals(200, monster.getAttack());
        assertEquals(true, monster.isAlive());
    }

    @Test
    public void monsterCanAttack() {
        monster.attack(vehicle);
        assertEquals(true, vehicle.isAlive());
        assertEquals(20, vehicle.getHealth());
    }

    @Test
    public void monsterCanKillWhenBuffed() {
        monster.roar();
        monster.attack(vehicle);
        assertEquals(false, vehicle.isAlive());
        assertEquals(220, monster.getAttack());
    }

    @Test
    public void monsterCanTakeDamage() {
        vehicle.machineGunAttack(monster);
        assertEquals(950, monster.getHealth());
    }

    @Test
    public void monsterCanHeal() {
        vehicle.machineGunAttack(monster);
        assertEquals(950, monster.getHealth());
        monster.fly();
        assertEquals(1000, monster.getHealth());
    }

    @Test
    public void monsterCanDie() {

    }
}
