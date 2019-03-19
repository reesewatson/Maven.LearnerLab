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
    public void testInheritance() {
        //Given
        Student student = new Student(12345678);

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
}
