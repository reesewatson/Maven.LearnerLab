package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    private Double totalStudyTime;


    public Student(long learner) {
        super(learner);
        this.totalStudyTime = 0.0; }

    public void learn(double numberOfHours) {
        //Increments the total study time by specified number of hours.
        this.totalStudyTime += numberOfHours; }

    public Double getTotalStudyTime() {
        //Returns the totalStudyTime instance variable ("this").
        return this.totalStudyTime; }
}

