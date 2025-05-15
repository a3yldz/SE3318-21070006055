package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterTest {

    @Test
    public void testGetName() {
        Character character = new Warrior("Aragorn", 100, 20);
        assertEquals("Aragorn", character.getName());

        Character characterWithNull = new Warrior(null, 100, 20);
        assertEquals("Unknown", characterWithNull.getName());
    }

    @Test
    public void testGetHealthAndTakeDamage() {
        Character character = new Warrior("Boromir", 100, 15);
        assertEquals(100, character.getHealth());

        character.takeDamage(30);
        assertEquals(70, character.getHealth());
    }

    @Test
    public void testIsDefeated() {
        Character character = new Warrior("Gimli", 10, 10);
        assertFalse(character.isDefeated());

        character.takeDamage(15);
        assertTrue(character.isDefeated());
    }

    @Test
    public void testDefend() {
        Character character = new Warrior("Legolas", 100, 20);
        character.defend(); // sadece output verir, exception atmaması yeterli
    }

    @Test
    public void testComplexMethodExample() {
        Character character = new Warrior("Thorin", 100, 10);
        character.complexMethodExample(); // sadece output verir, exception atmaması yeterli
    }
}
