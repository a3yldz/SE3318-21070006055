package org.example;

public abstract class Character {
    protected String name;

    protected int health;

    protected int attackPower;

    public Character(String name,int health,int attackPower) {
        this.name = name; this.health = health; this.attackPower = attackPower;
    }

    public String getName() {
        if (name != null) {
            return name;
        } else {
            return "Unknown";
        }
    }

    // FIXED: Checkstyle - EmptyLineSeparator
    public int getHealth() {
        return health;
    }

    // FIXED: Checkstyle - EmptyLineSeparator
    public void takeDamage(int damage) {
        health -= damage;
    }

    public abstract void specialAttack(Character opponent); // FIXED: Checkstyle - MethodName

    public boolean isDefeated() {
        if (health <= 0) {
            return true;
        }
        return false;
    }

    /**
     * Default defend method to reduce damage.
     * Can be overridden by subclasses for custom behavior.
     */
// ADDED: Optional Base Method - defend
    public void defend() {
        System.out.println(getName() + " defends, reducing incoming damage slightly.");
    }

    /**
     * A complex method example to simulate some business logic.
     */
// ADDED: New Feature - complexMethodExample
    public void complexMethodExample() {
        int damage = 0;
        for (int i = 1; i <= 3; i++) {
            damage += attackPower * i;
        }
        System.out.println(getName() + " unleashes a complex attack dealing " + damage + " damage!");
    }

}
