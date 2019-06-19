package io.zipcoder.interfaces;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class TestPeople {

    Student anish;

    @Before
    public void setUp() {
        anish = new Student(3);
        anish.setName("Anish");
    }

    @Test
    public void addStudentTest() {
        // Given
        List<Student> expected = new ArrayList();
        Students people = Students.getInstance();
        for (Student student : people.getPersonList()) {
            expected.add(student);
        }
        expected.add(anish);

        // When
        people.add(anish);
        List<Student> actual = people.getPersonList();

        // Then
        Assert.assertEquals(expected, actual);
        people.remove(anish);
    }

    @Test
    public void findById() {
        // Given
        Instructors people = Instructors.getInstance();
        Person expected = people.getPersonList().get(2);

        // When
        Person actual = people.findById((long) 3);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByNameTest() {
        //Given
        List<Person> personList = new ArrayList<Person>();
        Person alex = new Person(987487);

        //When
        personList.add(alex);
        boolean actual = personList.remove(alex);

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void removeByNameTest2() {
        //Given
        List<Person> personList = new ArrayList<Person>();
        Person bob = new Person(23464637);

        //When
        personList.add(bob);
        boolean actual = personList.remove(bob);

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void removeByNameTest3() {
        //Given
        List<Person> personList = new ArrayList<Person>();
        Person anish = new Person(249874798);

        //When
        personList.add(anish);
        boolean actual = personList.remove(anish);

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void removeByNameTest4() {
        //Given
        List<Person> personList = new ArrayList<Person>();
        Person kavya = new Person(82734687);

        //When
        personList.add(kavya);
        boolean actual = personList.remove(kavya);

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void removeById() {
        // Given
        List<Student> expected = new ArrayList();
        Students people = Students.getInstance();
        for(Student student : people.getPersonList()){
            expected.add(student);
        }
        Student anish = expected.get(3);
        expected.remove(anish);

        // When
        people.removeById(4);
        List<Student> actual = people.getPersonList();

        //Then
        Assert.assertEquals(expected, actual);
        people.add(anish);
    }

    @Test
    public void getCountTest() {
        //Given
        List<Student> expectedlist = new ArrayList();
        Students people = Students.getInstance();
        for (Student student : people.getPersonList()) {
            expectedlist.add(student);
        }

        //When
        Integer expected = expectedlist.size();
        Integer actual = people.getCount();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
