package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class Student  {


    private Integer id;
    private Double Hours;

    public Student() {
        this(null);
        // need to set the original hours learned
        Hours = 0.0;
    }

    public Student(Integer id) {
        this.id = id;
        Hours = 0.0;
    }

    public void learn(Double amountOfHours) {
        Hours += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return Hours;
    }
}
