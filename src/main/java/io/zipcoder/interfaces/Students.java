
package io.zipcoder.interfaces;


public final class Students extends People<Student> {

    public final static Students INSTANCE = new Students();



    private Students() {
        Student reese = new Student(2);
        reese.setName("Reese");
        Student prasanthi = new Student(4);
        prasanthi.setName("Prasanthi");
        Student rob = new Student(6);
        rob.setName("Rob");
        Student alicia = new Student(8);
        alicia.setName("Alicia");
        Student andrew = new Student(10);
        andrew.setName("Andrew");
        Student dan = new Student(12);
        dan.setName("Dan");

        add(reese);
        add(prasanthi);
        add(rob);
        add(alicia);
        add(andrew);
        add(dan);
    }

    @Override
    public Student[] getArray() {
        Student[] studentArray = personList.toArray(new Student[getPersonList().size()]);
        return studentArray;
    }

    public static Students getInstance() {
        return INSTANCE;
    }

}
