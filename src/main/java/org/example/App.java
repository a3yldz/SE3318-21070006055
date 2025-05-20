package org.example;

/**
 * Simple smoke test to try out the core classes.
 */
public class App {
    public static void main(String[] args) {
        // Try character
        Character frodo = new Character("Frodo", "Hobbit", 50, "Sting");
        frodo.printDetails();

        // Try map
        MiddleEarthMap map = new MiddleEarthMap();
        map.navigate("Mordor", true);

        // Try quest
        Quest quest = new Quest();
        quest.completeQuest(100, true);
        quest.startRescueMission(frodo);
    }
}
