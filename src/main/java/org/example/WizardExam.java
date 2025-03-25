package org.example;

import java.util.*;

public class WizardExam {
    private List<String> requiredSpells;

    public WizardExam(List<String> requiredSpells) {
        this.requiredSpells = requiredSpells;
    }

    /**
     * @requires student != null
     * @effects returns true if student knows all required spells
     */
    public boolean pass(HogwartsStudent student) {
        for (String spell : requiredSpells) {
            if (!student.knowsSpell(spell)) return false;
        }
        return true;
    }

    public void evaluate(HogwartsStudent student) {
        if (pass(student)) {
            System.out.println(student.getName() + " passed the exam!");
        } else {
            System.out.println(student.getName() + " failed the exam!");
        }
    }
}
