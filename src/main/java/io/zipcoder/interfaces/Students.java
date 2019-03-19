
package io.zipcoder.interfaces;


public final class Students extends People<Student> {

    public final static Students INSTANCE = new Students();



    private Students() {
        Student reese = new Student(2);
        reese.setName("Reese");
        Student eleonor = new Student(4);
        eleonor.setName("Eleonor");
        Student robyn = new Student(6);
        robyn.setName("Robyn");
        Student sean = new Student(8);
        sean.setName("Sean");
        Student ashley = new Student(10);
        ashley.setName("Ashley");
        Student ajah = new Student(12);
        ajah.setName("Ajah");

        add(reese);
        add(eleonor);
        add(robyn);
        add(sean);
        add(ashley);
        add(ajah);
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
