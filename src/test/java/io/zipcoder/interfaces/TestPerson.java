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
    public void personConstructorTest3(){
        //Given
        long givenId = 778919701;

        //When
        Person person = new Person(givenId);
        long actualId = person.getId();

        //Then
        Assert.assertEquals(givenId, actualId);
    }

    @Test
    public void personConstructorTest4() {
        //Given
        long givenId = 8931737;

        //When
        Person person = new Person(givenId);
        long actualId = person.getId();

        //Then
        Assert.assertEquals(givenId, actualId);
    }

    @Test
    public void personConstructorTest5() {
        //Given
        long givenId = 6685982;

        //When
        Person person = new Person(givenId);
        long actualId = person.getId();

        //Then
        Assert.assertEquals(givenId, actualId);

    }

    @Test
    public void personConstructorTest6() {
        //Given
        long givenId = 87458254;

        //When
        Person person = new Person(givenId);
        long actualId = person.getId();

        //Then
        Assert.assertEquals(givenId, actualId);
    }

    @Test
    public void personSetNameTest2() {
        //Given
        Person person = new Person(12345678);
        String expectedName = "Melanie";

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
        String expectedName = "Bob";

        //When
        person.setName(expectedName);
        String actualName = person.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void personSetNameTest4() {
        //Given
        Person person = new Person(12345678);
        String expectedName = "Naomi";

        //When
        person.setName(expectedName);
        String actualName = person.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void personSetNameTest5() {
        //Given
        Person person = new Person(12345678);
        String expectedName = "Zach";

        //When
        person.setName(expectedName);
        String actualName = person.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void personSetNameTest6() {
        //Given
        Person person = new Person(12345678);
        String expectedName = "Kaleb";

        //When
        person.setName(expectedName);
        String actualName = person.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void personSetNameTest7() {
        //Given
        Person person = new Person(12345678);
        String expectedName = "Nancy";

        //When
        person.setName(expectedName);
        String actualName = person.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }
}

