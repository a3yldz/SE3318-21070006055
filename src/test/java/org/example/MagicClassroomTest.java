package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MagicClassroomTest {

    private MagicClassroom classroom;

    @BeforeEach
    void setUp() {
        classroom = new MagicClassroom();
        HogwartsStudent harry = new HogwartsStudent("Harry", "Gryffindor", 3);
        harry.learnSpell("Expelliarmus");

        HogwartsStudent draco = new HogwartsStudent("Draco", "Slytherin", 3);
        draco.learnSpell("Crucio");

        HogwartsStudent luna = new HogwartsStudent("Luna", "Ravenclaw", 2);

        classroom.addStudent(harry);
        classroom.addStudent(draco);
        classroom.addStudent(luna);
    }

    @Test
    void testAddValidStudent() {
        assertNotNull(classroom.findStudent("Harry"));
    }

    @Test
    void testAddNullStudent() {
        classroom.addStudent(null);
        assertEquals(3, classroom.getStudentsSortedByHouse().size());
    }

    @Test
    void testFindStudentByName() {
        HogwartsStudent found = classroom.findStudent("Draco");
        assertNotNull(found);
        assertEquals("Slytherin", found.getHouse());
    }

    @Test
    void testFindStudentBySpell() {
        HogwartsStudent found = classroom.findStudentBySpell("Crucio");
        assertEquals("Draco", found.getName());
    }

    @Test
    void testGetStudentsByHouse() {
        List<HogwartsStudent> gryffs = classroom.getStudentsByHouse("Gryffindor");
        assertEquals(1, gryffs.size());
        assertEquals("Harry", gryffs.get(0).getName());
    }

    @Test
    void testGetStudentsSortedByHouse() {
        List<HogwartsStudent> sorted = classroom.getStudentsSortedByHouse();
        assertEquals(3, sorted.size());
        assertEquals("Harry", sorted.get(0).getName());
        assertEquals("Luna", sorted.get(1).getName());
        assertEquals("Draco", sorted.get(2).getName());
    }
}
