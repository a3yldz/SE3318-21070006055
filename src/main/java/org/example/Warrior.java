package org.example;

public class Warrior extends Character {
    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void special_Attack(Character opponent) {
        opponent.takeDamage(attackPower * 2);
    }

    /**
     * Boosts the warrior's attack power temporarily.
     * This method simulates a power-up move.
     */
// ADDED: New Feature - stronger
    public void stronger() {
        attackPower += 10;
        System.out.println(getName() + " used BOOST! Attack power increased to " + attackPower);
    }

}