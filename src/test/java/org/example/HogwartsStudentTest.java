package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HogwartsStudentTest {

    private HogwartsStudent student;

    @BeforeEach
    void setUp() {
        student = new HogwartsStudent("Harry", "Gryffindor", 3);
    }

    @Test
    void testLearnValidSpell() {
        boolean result = student.learnSpell("Expelliarmus");
        assertTrue(result);
        assertTrue(student.knowsSpell("Expelliarmus"));
    }

    @Test
    void testLearnNullSpell() {
        boolean result = student.learnSpell(null);
        assertFalse(result);
    }

    @Test
    void testLearnDuplicateSpell() {
        student.learnSpell("Lumos");
        boolean result = student.learnSpell("Lumos");
        assertFalse(result);
    }

    @Test
    void testKnowsSpellCorrectness() {
        student.learnSpell("Accio");
        assertTrue(student.knowsSpell("Accio"));
        assertFalse(student.knowsSpell("Avada Kedavra"));
    }
}
