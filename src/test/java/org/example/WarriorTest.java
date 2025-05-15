package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * ADDED: JUnit Tests for Warrior class.
 */
public class WarriorTest {

    @Test
    public void testStrongerIncreasesAttackPower() {
        Warrior warrior = new Warrior("TestWarrior", 100, 10);
        warrior.stronger(); // ADDED: JUnit Test for stronger()
        assertEquals(20, warrior.attackPower); // 10 + 10 = 20
    }

    @Test
    public void testIsDefeatedWhenHealthIsZero() {
        Warrior warrior = new Warrior("TestWarrior", 0, 15);
        assertTrue(warrior.isDefeated());
    }

    @Test
    public void testIsNotDefeatedWhenHealthIsPositive() {
        Warrior warrior = new Warrior("TestWarrior", 50, 15);
        assertFalse(warrior.isDefeated());
    }

    @Test
    public void testGetNameReturnsName() {
        Warrior warrior = new Warrior("TestWarrior", 100, 10);
        assertEquals("TestWarrior", warrior.getName());
    }

    @Test
    public void testGetNameReturnsUnknownIfNull() {
        Warrior warrior = new Warrior(null, 100, 10);
        assertEquals("Unknown", warrior.getName());
    }
}
