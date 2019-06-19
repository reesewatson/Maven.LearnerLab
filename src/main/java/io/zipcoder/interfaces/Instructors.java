package io.zipcoder.interfaces;



public final class Instructors extends People<Instructor> implements Teacher{


    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        Instructor melanie = new Instructor((long) 1);
        melanie.setName("Melanie");
        Instructor dolio = new Instructor((long) 2);
        dolio.setName("Dolio");
        Instructor kris = new Instructor((long) 3);
        kris.setName("Kris");
        Instructor wilhem = new Instructor((long) 4);
        wilhem.setName("Wilhem");
        Instructor froilan = new Instructor((long) 5);
        froilan.setName("Froilan");

        personList.add(melanie);
        personList.add(dolio);
        personList.add(kris);
        personList.add(wilhem);
        personList.add(froilan);
    }

    public static Instructors getInstance(){ return INSTANCE; }

    @Override
    public Instructor[] getArray() {
        Instructor[] instructorArray = getPersonList().toArray(new Instructor[0]);
        return instructorArray;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {

    }
}
