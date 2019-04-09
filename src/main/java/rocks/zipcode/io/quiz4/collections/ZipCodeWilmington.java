package rocks.zipcode.io.quiz4.collections;


import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    List<Student> zcwList = new ArrayList<>();


    public void enroll(Student student) {
        zcwList.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return zcwList.contains(student);
    }

    public void lecture(double numberOfHours) {
        //for each student we are invoking the learn method and passing through the param numberofHours
        zcwList.forEach(x -> x.learn(numberOfHours));
    }

    public Map<Student, Double> getStudyMap() {
/// need a linked hashmap-> the tests will show that it matters the order of which its put into the map
        // thus the linked hashmap
        Map<Student, Double> studymap = new LinkedHashMap<>();
        for (Student stu : zcwList) {
            studymap.put(stu, stu.getTotalStudyTime());
        }
        return studymap;
    }
}
