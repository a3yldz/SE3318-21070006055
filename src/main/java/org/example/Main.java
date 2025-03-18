package org.example;

public class Main {

    public static void main(String[] args) {


        Mentor gandalf = new Mentor("Gandalf the Grey", "Wizard");
        Mentor elrond = new Mentor("Elrond", "Lord of Rivendell");


        Adventurer frodo = new Adventurer("Frodo Baggins", "Ring-bearer", "Hobbit");
        Adventurer aragorn = new Adventurer("Aragorn", "King of Gondor", "Man");


        Quest destroyTheOneRing = new Quest("Destroy the One Ring", "Hard", gandalf);
        Quest defendHelmsDeep = new Quest("Defend Helm's Deep", "Very Hard", elrond);


        frodo.joinQuest(destroyTheOneRing);
        aragorn.joinQuest(defendHelmsDeep);


        System.out.println(frodo.getName() + " has joined the following quests:");
        for (Quest quest : frodo.getQuests()) {
            System.out.println("Quest: " + quest.getName() + ", Mentor: " + quest.getMentor().getName());
        }


        System.out.println("Adventurers in 'Defend Helm's Deep':");
        for (Adventurer adventurer : defendHelmsDeep.getAdventurers()) {
            System.out.println(adventurer.getName());
        }
    }
}