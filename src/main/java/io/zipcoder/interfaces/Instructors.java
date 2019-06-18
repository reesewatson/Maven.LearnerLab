package io.zipcoder.interfaces;



public final class Instructors extends People<Instructor> implements Teacher{


    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){}

    public static Instructors getInstance(){ return INSTANCE; }

    @Override
    public Instructor[] getArray() { return getPersonList().toArray(new Instructor[0]); }

    @Override
    public void teach(Learner learner, double numberOfHours) {

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {

    }
}
