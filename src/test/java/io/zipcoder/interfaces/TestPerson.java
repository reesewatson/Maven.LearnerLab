package io.zipcoder.interfaces;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void personConstructorTest(){
        // Given
        long expectedId = 24681090;

        // When
        Person person = new Person(expectedId);
        long actualId = person.getId();

        // Then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void personConstructorTest2(){
        //Given
        long expectedId = 00000000;

        //When
        Person person = new Person(expectedId);
        long actualId = person.getId();

        //Then
        Assert.assertEquals(expectedId, actualId);
    }


    @Test
    public void personSetNameTest2() {
        //Given
        Person person = new Person(12345678);
        String expectedName = "Brian";

        //When
        person.setName(expectedName);
        String actualName = person.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void personSetNameTest3() {
        //Given
        Person person = new Person(12345679);
        String expectedName = "Sean";

        //When
        person.setName(expectedName);
        String actualName = person.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }
}

