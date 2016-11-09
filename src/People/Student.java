package People;
import Basics.*;
import Lessons.*;

import People.Person;
import Schedule.TeachingSchedule;

/**
 * Created by Konstantin on 31.08.2016.
 */
public class Student extends Person {
    private YearOfStudy yearOfStudy;
    private TeachingSchedule studentSchedule;

    public Student(Name name){
        super(name);
    }

    public void SetTeachingSchedule(TeachingSchedule schedule){
        studentSchedule = schedule;
    }

    public void DisplayStudSchedule(){
        System.out.println("Schedule for " + name.getName() + ":");
        studentSchedule.DisplaySchedule();
    }
}
