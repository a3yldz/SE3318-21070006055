package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void testAddCharacter() {
        Game game = new Game();
        Warrior warrior = new Warrior("Aragorn", 100, 15);

        game.addCharacter(warrior);
    }

    @Test
    public void testStartGameRunsWithoutCrash() {
        Game game = new Game();
        Warrior warrior = new Warrior("Leonidas", 100, 30);
        Mage mage = new Mage("Gandalf", 60, 25);

        game.addCharacter(warrior);
        game.addCharacter(mage);

        game.startGame();
    }
}
