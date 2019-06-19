
package io.zipcoder.interfaces;


public final class Students extends People<Student> {

    public final static Students INSTANCE = new Students();



    private Students() {
        Student reese = new Student(1);
        reese.setName("Reese");
        Student prasanthi = new Student(2);
        prasanthi.setName("Prasanthi");
        Student rob = new Student(3);
        rob.setName("Rob");
        Student alicia = new Student(4);
        alicia.setName("Alicia");
        Student andrew = new Student(5);
        andrew.setName("Andrew");
        Student dan = new Student(6);
        dan.setName("Dan");
        Student connor = new Student(7);
        dan.setName("Connor");
        Student ben = new Student(8);
        dan.setName("Ben");
        Student ben2 = new Student(9);
        dan.setName("Ben2");
        Student ajula = new Student(10);
        dan.setName("Ajula");
        Student steffun = new Student(11);
        dan.setName("Steffun");
        Student erick = new Student(12);
        dan.setName("Erick");
        Student bob = new Student(13);
        dan.setName("Bob");
        Student angelica = new Student(14);
        dan.setName("Angelica");
        Student justin = new Student(15);
        dan.setName("Justin");
        Student donna = new Student(16);
        dan.setName("Donna");
        Student darya = new Student(17);
        dan.setName("Darya");
        Student will = new Student(18);
        dan.setName("Will");
        Student alex = new Student(19);
        dan.setName("Alex");
        Student joanna = new Student(20);
        dan.setName("Joanna");
        Student kavya = new Student(21);
        dan.setName("Kavya");
        Student sputnika = new Student(22);
        dan.setName("Sputnika");
        Student alex2 = new Student(23);
        dan.setName("Alex2");
        Student anish = new Student(24);
        dan.setName("Anish");
        Student aashna = new Student(25);
        dan.setName("Aashna");
        Student abram = new Student(26);
        dan.setName("Abram");
        Student ed = new Student(27);
        dan.setName("Ed");
        Student caleb = new Student(28);
        dan.setName("Caleb");
        Student henry = new Student(29);
        dan.setName("Henry");

        add(reese);
        add(prasanthi);
        add(rob);
        add(alicia);
        add(andrew);
        add(dan);
        add(henry);
        add(connor);
        add(alex);
        add(aashna);
        add(abram);
        add(ajula);
        add(alex2);
        add(andrew);
        add(angelica);
        add(anish);
        add(caleb);
        add(ben);
        add(ben2);
        add(bob);
        add(ed);
        add(erick);
        add(justin);
        add(kavya);
        add(sputnika);
        add(steffun);
        add(darya);
        add(dan);
        add(donna);
    }

    @Override
    public Student[] getArray() {
        Student[] studentArray = getPersonList().toArray(new Student[0]);
        return studentArray;
    }

    public static Students getInstance() {
        return INSTANCE;
    }

}
