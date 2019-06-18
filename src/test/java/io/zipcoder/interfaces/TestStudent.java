package io.zipcoder.interfaces;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        // Given
        Student student = new Student(24681012);

        // When
        boolean actual = student instanceof Learner;

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testImplementation2(){
        // Given
        Student student = new Student(2467865);

        // When
        boolean actual = student instanceof Learner;

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testImplementation3(){
        // Given
        Student student = new Student(786556012);

        // When
        boolean actual = student instanceof Learner;

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testImplementation4(){
        // Given
        Student student = new Student(29776012);

        // When
        boolean actual = student instanceof Learner;

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testImplementation5(){
        // Given
        Student student = new Student(765755412);

        // When
        boolean actual = student instanceof Learner;

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testInheritance() {
        //Given
        Student student = new Student(12345678);

        //When
        boolean actual = student instanceof Person;

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testInheritance2() {
        //Given
        Student student = new Student(16567578);

        //When
        boolean actual = student instanceof Person;

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testInheritance3() {
        //Given
        Student student = new Student(765765778);

        //When
        boolean actual = student instanceof Person;

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testInheritance4() {
        //Given
        Student student = new Student(543354368);

        //When
        boolean actual = student instanceof Person;

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testInheritance5() {
        //Given
        Student student = new Student(765765778);

        //When
        boolean actual = student instanceof Person;

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testLearn() {
        //Given
        Student student = new Student(12356789);
        double expected = 4;

        //When
        student.learn(expected);
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected,actual,.001);
    }

    @Test
    public void testLearn2() {
        //Given
        Student student = new Student(78665759);
        double given = 9;

        //When
        student.learn(given);
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(given,actual,.001);
    }

    @Test
    public void testLearn3() {
        //Given
        Student student = new Student(453543789);
        double given = 3;

        //When
        student.learn(given);
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(given,actual,.001);
    }

    @Test
    public void testLearn4() {
        //Given
        Student student = new Student(127654789);
        double given = 6;

        //When
        student.learn(given);
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(given,actual,.001);
    }

    @Test
    public void testLearn5() {
        //Given
        Student student = new Student(987976789);
        double given = 1;

        //When
        student.learn(given);
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(given,actual,.001);
    }
}
