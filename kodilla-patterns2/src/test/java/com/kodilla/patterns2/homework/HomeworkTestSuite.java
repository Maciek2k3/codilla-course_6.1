package com.kodilla.patterns2.homework;


import com.kodilla.patterns2.observer.homework.Homework1;
import com.kodilla.patterns2.observer.homework.Homework2;
import com.kodilla.patterns2.observer.homework.Mentor;
import com.kodilla.patterns2.observer.homework.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testStudent() {
        // Given
        Student student = new Student("Jon");
        Student student1 = new Student("Josh");
        Mentor mentor = new Mentor("Marc");
        Mentor mentor1 = new Mentor("Joakim");
        Homework1 homework1 = new Homework1();
        Homework2 homework2 = new Homework2();

        student1.registerObserver(mentor);
        student1.registerObserver(mentor1);
        student.registerObserver(mentor);
        //When
        student.addHomework(homework1.toString());
        student.addHomework(homework2.toString());
        student1.addHomework(homework1.toString());


        // Then
        assertEquals(3, mentor.getUpdateCount());
        assertEquals(1, mentor1.getUpdateCount());
    }
}

