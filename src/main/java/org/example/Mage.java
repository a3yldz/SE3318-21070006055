package org.example;

public class Mage extends Character {
    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

// FIXED: Checkstyle - EmptyLineSeparator
// FIXED: Checkstyle - ParameterName
@Override

public void specialAttack(Character opponent) {
        opponent.takeDamage(attackPower + 50);
    }

    /**
     * Activates a magical shield that halves the next incoming damage.
     */
// ADDED: New Feature - shield
    public void shield() {
        System.out.println(getName() + " casts a SHIELD spell! Next attack will be reduced.");
    }

}
