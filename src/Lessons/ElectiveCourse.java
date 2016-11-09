package Lessons;

import Basics.YearOfStudy;
import People.Assistant;
import People.Instructor;

/**
 * Created by Konstantin on 08.09.2016.
 */
public class ElectiveCourse extends LectureCourse {
    public ElectiveCourse(String title, YearOfStudy year, Instructor instructor){
        super(title, year, instructor);
    }

    @Override
    public String getTitle() {
        return super.getTitle() + " (elective)";
    }
}
