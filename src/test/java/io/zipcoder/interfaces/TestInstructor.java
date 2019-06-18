package io.zipcoder.interfaces;
import org.junit.Assert;
import org.junit.Test;

    public class TestInstructor {

        private Object Instructor;

        @Test
        public void testImplementation() {
            // Given
            Instructor instructor = new Instructor((long) 87687655);

            // When
            boolean actual = instructor instanceof Teacher;

            // Then
            Assert.assertTrue(actual);
        }

        @Test
        public void testImplementation2() {
            // Given
            Instructor dolio = new Instructor((long) 87698655);

            // When
            boolean actual = dolio instanceof Teacher;

            // Then
            Assert.assertTrue(actual);
        }

        @Test
        public void testImplementation3() {
            // Given
            Instructor kris = new Instructor((long) 83542655);

            // When
            boolean actual = kris instanceof Teacher;

            // Then
            Assert.assertTrue(actual);
        }

        @Test
        public void testInheritance() {
            //Given
            Instructor instructor = new Instructor((long) 986876607);

            //When
            boolean actual = instructor instanceof Person;

            //Then
            Assert.assertTrue(actual);
        }

        @Test
        public void testInheritance2() {
            //Given
            Instructor wilhem = new Instructor((long) 3787607);

            //When
            boolean actual = wilhem instanceof Person;

            //Then
            Assert.assertTrue(actual);
        }

        @Test
        public void testInheritance3() {
            //Given
            Instructor froilan = new Instructor((long) 246476607);

            //When
            boolean actual = froilan instanceof Person;

            //Then
            Assert.assertTrue(actual);
        }

        @Test
        public void testTeach(){
        //Create a testTeach method that ensures when an Instructor invokes the teach method, a respective
        //student's totalStudyTime instance variable is incremented by the specified numberOfHours.
            //Given
            Teacher wilhem = new Instructor(30L);
            double hoursTeaching = 5;

            //When
            Student reese = new Student(8L);
            wilhem.teach(reese, hoursTeaching);
            double actual = reese.getTotalStudyTime();

            //Then
            Assert.assertEquals(hoursTeaching, actual, 0.001);
        }

        @Test
        public void testTeach2(){
            //Given
            Teacher kris = new Instructor((long) 87687);
            double hoursTeaching = 5;

            //When
            Student prasanthi = new Student(876876);
            kris.teach(prasanthi, hoursTeaching);
            double actual = prasanthi.getTotalStudyTime();

            //Then
            Assert.assertEquals(hoursTeaching, actual, 0.001);
        }

        @Test
        public void testTeach3(){
            //Given
            Teacher dolio = new Instructor((long) 8384625);
            double hoursTeaching = 5;

            //When
            Student alicia = new Student(4343254);
            dolio.teach(alicia, hoursTeaching);
            double actual = alicia.getTotalStudyTime();

            //Then
            Assert.assertEquals(hoursTeaching, actual, 0.001);
        }

        @Test
        public void testTeach4(){
            //Given
            Teacher froilan = new Instructor((long) 43254653);
            double hoursTeaching = 5;

            //When
            Student steffun = new Student(9833143);
            froilan.teach(steffun, hoursTeaching);
            double actual = steffun.getTotalStudyTime();

            //Then
            Assert.assertEquals(hoursTeaching, actual, 0.001);
        }

        @Test
        public void testTeach5(){
            //Given
            Teacher melanie = new Instructor((long) 43422545);
            double hoursTeaching = 5;

            //When
            Student will = new Student(3227832);
            melanie.teach(will, hoursTeaching);
            double actual = will.getTotalStudyTime();

            //Then
            Assert.assertEquals(hoursTeaching, actual, 0.001);
        }

        @Test
        public void testTeach6(){
            //Given
            Teacher teacher = new Instructor((long) 2376386);
            double hoursTeaching = 5;

            //When
            Student student = new Student(387642498);
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
            Teacher kris = new Instructor(2L);
            Student joanna = new Student(4L);
            Student ben = new Student(6L);
            Student aashna = new Student(8L);

            Student[] studentArray = new Student[]{joanna, ben, aashna};

            double numberOfHours = 15;
            double expected = 5;

            //When
            kris.lecture(studentArray, numberOfHours);

            //Then
            for (Student s : studentArray) {
                double actual = joanna.getTotalStudyTime();
                Assert.assertEquals(expected, actual, 0);
            }
        }

        @Test
        public void testLecture2() {
            //Given
            Teacher dolio = new Instructor(2L);
            Student will = new Student(4L);
            Student rob = new Student(6L);
            Student connor = new Student(8L);

            Student[] studentArray = new Student[]{will, rob, connor};

            double numberOfHours = 15;
            double expected = 5;

            //When
            dolio.lecture(studentArray, numberOfHours);

            //Then
            for (Student s : studentArray) {
                double actual = will.getTotalStudyTime();
                Assert.assertEquals(expected, actual, 0);
            }
        }

        @Test
        public void testLecture3() {
            //Given
            Teacher wilhem = new Instructor(2L);
            Student angelica = new Student(4L);
            Student erick = new Student(6L);
            Student donna = new Student(8L);

            Student[] studentArray = new Student[]{angelica, erick, donna};

            double numberOfHours = 15;
            double expected = 5;

            //When
            wilhem.lecture(studentArray, numberOfHours);

            //Then
            for (Student s : studentArray) {
                double actual = angelica.getTotalStudyTime();
                Assert.assertEquals(expected, actual, 0);
            }
        }

        @Test
        public void testLecture4() {
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

