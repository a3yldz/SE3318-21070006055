package org.example;
import java.util.*;

public class HogwartsStudent {
    private String name;
    private String house;
    private int year;
    private List<String> spellsLearned;

    public HogwartsStudent(String name, String house, int year) {
        this.name = name;
        this.house = house;
        this.year = year;
        this.spellsLearned = new ArrayList<>();
    }

    /**
     * @requires spell != null && !spellsLearned.contains(spell)
     * @effects adds spell to spellsLearned if not known before
     */
    public boolean learnSpell(String spell) {
        if (spell == null || spellsLearned.contains(spell)) return false;
        spellsLearned.add(spell);
        return true;
    }

    /**
     * @requires spell != null
     * @effects returns true if student knows the spell
     */
    public boolean knowsSpell(String spell) {
        return spellsLearned.contains(spell);
    }

    public String getName() { return name; }
    public String getHouse() { return house; }
    public List<String> getSpellsLearned() { return spellsLearned; }
}
