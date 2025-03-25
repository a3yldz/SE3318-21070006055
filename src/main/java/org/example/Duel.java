package org.example;

import java.util.Random;

public class Duel {

    /**
     * @requires s1 != null && s2 != null && spell != null
     * @effects Simulates duel and prints result
     */
    public static void start(HogwartsStudent s1, HogwartsStudent s2, String spell) {
        boolean s1Knows = s1.knowsSpell(spell);
        boolean s2Knows = s2.knowsSpell(spell);

        if (!s1Knows && !s2Knows) {
            System.out.println("It's a draw! Neither knows the spell.");
        } else if (s1Knows && !s2Knows) {
            System.out.println(s1.getName() + " wins the duel!");
        } else if (!s1Knows && s2Knows) {
            System.out.println(s2.getName() + " wins the duel!");
        } else {
            int s1Power = new Random().nextInt(100);
            int s2Power = new Random().nextInt(100);
            if (s1Power > s2Power) {
                System.out.println(s1.getName() + " wins the duel with magic power!");
            } else if (s2Power > s1Power) {
                System.out.println(s2.getName() + " wins the duel with magic power!");
            } else {
                System.out.println("It's a tie!");
            }
        }
    }
}
