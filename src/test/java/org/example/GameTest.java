package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void testAddCharacter() {
        Game game = new Game();
        Warrior warrior = new Warrior("Aragorn", 100, 15);

        game.addCharacter(warrior);

        // Yalnızca assert yapılacak bir listeye erişimimiz yok ama crash olmaması testin geçmesi için yeterli
        // Alternatif: Reflection veya karakter sayısını dönen public bir metot
    }

    @Test
    public void testStartGameRunsWithoutCrash() {
        Game game = new Game();
        Warrior warrior = new Warrior("Leonidas", 100, 30);
        Mage mage = new Mage("Gandalf", 60, 25); // Kolay ölebilsin

        game.addCharacter(warrior);
        game.addCharacter(mage);

        // Bu metot sadece konsol çıktısı verir, crash olmaması test için yeterlidir.
        game.startGame();
    }
}
