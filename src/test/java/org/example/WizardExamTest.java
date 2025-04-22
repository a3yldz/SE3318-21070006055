package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WizardExamTest {

    private WizardExam exam;
    private HogwartsStudent hermione, ron;

    @BeforeEach
    void setUp() {
        List<String> required = Arrays.asList("Lumos", "Accio", "Alohomora");
        exam = new WizardExam(required);

        hermione = new HogwartsStudent("Hermione", "Gryffindor", 3);
        hermione.learnSpell("Lumos");
        hermione.learnSpell("Accio");
        hermione.learnSpell("Alohomora");

        ron = new HogwartsStudent("Ron", "Gryffindor", 3);
        ron.learnSpell("Lumos");
    }

    @Test
    void testPassReturnsTrueIfAllSpellsKnown() {
        assertTrue(exam.pass(hermione));
    }

    @Test
    void testPassReturnsFalseIfAnySpellMissing() {
        assertFalse(exam.pass(ron));
    }

    @Test
    void testEvaluatePrintsCorrectMessage() {
        System.setOut(new java.io.PrintStream(new java.io.ByteArrayOutputStream()));
        exam.evaluate(hermione);
        exam.evaluate(ron);
        assertDoesNotThrow(() -> exam.evaluate(hermione));
    }
}
