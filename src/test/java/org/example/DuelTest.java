package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DuelTest {

    private HogwartsStudent harry, draco;

    @BeforeEach
    void setUp() {
        harry = new HogwartsStudent("Harry", "Gryffindor", 3);
        draco = new HogwartsStudent("Draco", "Slytherin", 3);

        harry.learnSpell("Expelliarmus");
        draco.learnSpell("Crucio");
    }

    @Test
    void testDuelBothKnowSpell() {
        harry.learnSpell("Crucio");
        assertDoesNotThrow(() -> Duel.start(harry, draco, "Crucio"));
    }

    @Test
    void testDuelOnlyOneKnowsSpell() {
        assertDoesNotThrow(() -> Duel.start(harry, draco, "Expelliarmus"));
    }

    @Test
    void testDuelNeitherKnowsSpell() {
        assertDoesNotThrow(() -> Duel.start(harry, draco, "Avada Kedavra"));
    }

    @Test
    void testDuelWithNullInputs() {
        assertThrows(NullPointerException.class, () -> Duel.start(null, draco, "Expelliarmus"));
        assertThrows(NullPointerException.class, () -> Duel.start(harry, null, "Expelliarmus"));
        assertThrows(NullPointerException.class, () -> Duel.start(harry, draco, null));
    }
}
