package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArcherTest {

    @Test
    public void testSpecialAttackIncreasesDamage() {
        Character opponent = new Warrior("Dummy", 100, 10);
        Archer archer = new Archer("Legolas", 80, 15);

        archer.specialAttack(opponent);

        // 100 - (15 + 20) = 65
        assertEquals(65, opponent.getHealth());
    }

    @Test
    public void testEvadePrintsMessage() {
        Archer archer = new Archer("Robin", 70, 12);

// We do not check the output but we test that the method works properly
        archer.evade();
    }
}
