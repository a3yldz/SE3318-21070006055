package org.example;

import java.util.*;

public class AncientSpellbook {
    private List<String> spells;

    public AncientSpellbook() {
        spells = new ArrayList<>();
    }

    public void addSpell(String spell) {
        spells.add(spell);
    }

    /**
     * @requires index >= 0 && index < spells.size()
     * @effects returns spell at given index
     */
    public String getSpell(int index) {
        return spells.get(index);
    }

    /**
     * @requires prefix != null
     * @effects returns list of spells starting with the prefix
     */
    public List<String> getSpellsByPrefix(String prefix) {
        List<String> result = new ArrayList<>();
        for (String spell : spells) {
            if (spell.startsWith(prefix)) {
                result.add(spell);
            }
        }
        return result;
    }
}
