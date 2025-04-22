package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SpellBookTest {

    private AncientSpellbook spellbook;

    @BeforeEach
    void setUp() {
        spellbook = new AncientSpellbook();
        spellbook.addSpell("Alohomora");
        spellbook.addSpell("Accio");
        spellbook.addSpell("Avada Kedavra");
    }

    @Test
    void testGetSpellByValidIndex() {
        assertEquals("Alohomora", spellbook.getSpell(0));
    }

    @Test
    void testGetSpellByInvalidIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> spellbook.getSpell(10));
    }

    @Test
    void testGetSpellsByExactPrefix() {
        List<String> result = spellbook.getSpellsByPrefix("Alo");
        assertEquals(1, result.size());
        assertTrue(result.contains("Alohomora"));
    }

    @Test
    void testGetSpellsByEmptyPrefix() {
        List<String> result = spellbook.getSpellsByPrefix("");
        assertEquals(3, result.size());
    }

    @Test
    void testGetSpellsByNoMatchPrefix() {
        List<String> result = spellbook.getSpellsByPrefix("Z");
        assertTrue(result.isEmpty());
    }
}
