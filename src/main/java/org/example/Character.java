package org.example;

/**
 * Represents a character in the Lord of the Rings universe.
 * Each character has a name, race, age, and a unique weapon.
 */
public class Character {

    private String name;
    private String race;
    private int age;
    private String weapon; // ✅ ADDED: Unique attribute (weapon) required by the assignment

    /**
     * Constructs a character with the given name, race, age, and weapon.
     *
     * @param name   The name of the character.
     * @param race   The race (e.g., Hobbit, Elf).
     * @param age    The age of the character.
     * @param weapon The weapon the character carries.
     */
    public Character(String name, String race, int age, String weapon) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.weapon = weapon;
    }

    /**
     * Prints details about the character, including specific rules based on attributes.
     */
    public void printDetails() {
        if (race.equals("Hobbit")) {
            System.out.println("Character is a Hobbit");
        }

        if (age >= 50) {
            System.out.println("Character is 50 or older");
        } else if (name.equals("Frodo")) {
            System.out.println("Character is Frodo");
        }

        // ✅ ADDED: Print weapon info
        System.out.println("Weapon: " + weapon);
    }

    /**
     * Getter for the character's name.
     *
     * @return name of the character
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for the weapon.
     *
     * @return weapon of the character
     */
    public String getWeapon() {
        return weapon;
    }

    /**
     * Assigns a new weapon to the character.
     *
     * @param weapon new weapon to assign
     */
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
