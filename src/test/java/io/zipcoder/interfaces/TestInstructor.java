package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

    public class TestInstructor {

        private Object Instructor;

        @Test
        public void testImplementation() {
            // Given
            Teacher teacher = new Instructor(30L);

            // When
            boolean actual = Instructor instanceof Teacher;

            // Then
            Assert.assertTrue(actual);
        }

        @Test
        public void testInheritance() {
            //Given
            Teacher teacher = new Instructor(20L);

            //When
            boolean actual = Instructor instanceof Person;

            //Then
            Assert.assertTrue(actual);
        }

        @Test
        public void testTeach(){
        //Create a testTeach method that ensures when an Instructor invokes the teach method, a respective
        //student's totalStudyTime instance variable is incremented by the specified numberOfHours.
            Teacher teacher = new Instructor(30L);
            double hoursTeaching = 5;

            //When
            Student student = new Student(8L);
            teacher.teach(student, hoursTeaching);
            double actual = student.getTotalStudyTime();

            //Then
            Assert.assertEquals(hoursTeaching, actual, 0.001);
        }


        //create a method that ensures when an instructor invokes the lecture method a respective array of students'
        // totalStudyTime instance variables is incremented by numberOfHours/students.length
        @Test
        public void testLecture() {
            //Given
            Teacher teacher = new Instructor(2L);
            Student student = new Student(4L);
            Student student2 = new Student(6L);
            Student student3 = new Student(8L);

            Student[] studentArray = new Student[]{student, student2, student3};

            double numberOfHours = 15;
            double expected = 5;

            //When
            teacher.lecture(studentArray, numberOfHours);

            //Then
            for (Student s : studentArray) {
                double actual = student.getTotalStudyTime();
                Assert.assertEquals(expected, actual, 0);
            }
        }
    }

