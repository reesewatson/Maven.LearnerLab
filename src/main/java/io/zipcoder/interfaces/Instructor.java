package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor(Long id) { super(id); }

        //Teach handles one learner object at a time.
    public void teach(Learner learner, double numberOfHours) {

        //Invokes learn method on learner object.
        learner.learn(numberOfHours); }

        //Lecture handles many learner objects.
    public void lecture(Learner[] learners, double numberOfHours) {

        // The instructor should have a concrete implementation of the
        // lecture method which invokes the learn method on each of the elements
        // in the specified array of Learner objects.
        for (Learner learner : learners) {

            //Number of hours is divided by learners array length to account for each learner's number of hours.
            learner.learn(numberOfHours / learners.length); }
    }
}
