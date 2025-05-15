package org.example;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        Warrior warrior = new Warrior("Conan", 100, 15);
        Mage mage = new Mage("Merlin", 80, 20);
        Archer archer = new Archer("Legolas", 90, 18);

        // ADDED: Smoke Test - New Methods
        warrior.stronger();
        mage.shield();
        archer.evade();

        game.addCharacter(warrior);
        game.addCharacter(mage);
        game.addCharacter(archer);

        game.startGame(); // previously fixed from StartGame
    }
}
