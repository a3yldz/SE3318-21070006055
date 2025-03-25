package org.example;

import java.util.*;

public class App {
    public static void main(String[] args) {
        HogwartsStudent harry = new HogwartsStudent("Harry", "Gryffindor", 5);
        HogwartsStudent draco = new HogwartsStudent("Draco", "Slytherin", 5);
        HogwartsStudent luna = new HogwartsStudent("Luna", "Ravenclaw", 4);

        System.out.println("Learning spells:");
        System.out.println("Harry learns Expelliarmus: " + harry.learnSpell("Expelliarmus"));
        System.out.println("Harry learns Lumos: " + harry.learnSpell("Lumos"));
        System.out.println("Draco learns Crucio: " + draco.learnSpell("Crucio"));
        System.out.println("Luna learns Accio: " + luna.learnSpell("Accio"));

        AncientSpellbook book = new AncientSpellbook();
        book.addSpell("Expelliarmus");
        book.addSpell("Expecto Patronum");
        book.addSpell("Lumos");
        book.addSpell("Leviosa");

        System.out.println("Spells with 'Ex': " + book.getSpellsByPrefix("Ex"));

        MagicClassroom classroom = new MagicClassroom();
        classroom.addStudent(harry);
        classroom.addStudent(draco);
        classroom.addStudent(luna);

        System.out.println("Student who knows Lumos: " + classroom.findStudentBySpell("Lumos").getName());

        WizardExam exam = new WizardExam(Arrays.asList("Lumos", "Expelliarmus"));
        exam.evaluate(harry);
        exam.evaluate(draco);

        System.out.println("\nDuel between Harry and Draco using Expelliarmus:");
        Duel.start(harry, draco, "Expelliarmus");

        System.out.println("\nDuel between Luna and Draco using Crucio:");
        Duel.start(luna, draco, "Crucio");
    }
}
