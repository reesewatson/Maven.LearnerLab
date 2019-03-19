package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Educator;
import io.zipcoder.interfaces.Student;
import io.zipcoder.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

    public class TestEducator {

        @Test
        public void testImplementation(){
            // Given
            Educator educator = Educator.LEON;

            // When
            boolean actual = educator instanceof Teacher;

            // Then
            Assert.assertTrue(actual);
        }


        @Test
        public void testTeach(){
            // Given
            Educator educator = Educator.NHU;
            Student student = new Student(7654321);
            double expected = 10;

            // When
            educator.teach(student, expected);
            double actual = student.getTotalStudyTime();

            // Then
            Assert.assertEquals(expected, actual, .001);
        }

//    @Test
//    public void testTeachEducatorTimeWorked(){
//        // Given
//        Educator educator = Educator.NHU;
//        Student student = new Student(7654321);
//        double expected = 10;
//
//        // When
//        educator.teach(student, expected);
//        double actual = educator.timeWorked;
//
//        // Then
//        Assert.assertEquals(expected, actual, .001);
//    }

        @Test
        public void testLecture(){
            // Given
            Educator educator = Educator.WIL;
            Student student1 = new Student(1);
            Student student2 = new Student(2);
            Student student3 = new Student(3);
            Student[] studentsExpected = new Student[3];
            studentsExpected[0] = student1;
            studentsExpected[1] = student2;
            studentsExpected[2] = student3;

            for(int i = 0; i < 3; i++){
                studentsExpected[i].learn(5);
            }

            // When
            Student[] studentsActual = new Student[3];
            studentsActual[0] = student1;
            studentsActual[1] = student2;
            studentsActual[2] = student3;

            educator.lecture(studentsActual, 15);

            // Then
            Assert.assertArrayEquals(studentsExpected, studentsActual);
        }

        @Test
        public void testLectureEducatorTimeWorked(){
            // Given
            Educator educator = Educator.LEON;
            Student student1 = new Student(1);
            Student student2 = new Student(2);
            Student student3 = new Student(3);
            Student[] students= new Student[3];
            students[0] = student1;
            students[1] = student2;
            students[2] = student3;

            double expected = 15;

            // When
            educator.lecture(students, (int) expected);
            double actual = educator.timeWorked;

            // Then
            Assert.assertEquals(expected, actual, .001);
        }

    }
