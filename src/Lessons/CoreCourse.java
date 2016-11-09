package Lessons;

import Basics.YearOfStudy;
import People.Assistant;
import People.Instructor;

/**
 * Created by Konstantin on 08.09.2016.
 */
public class CoreCourse extends LectureCourse {
    private Assistant assistant;

    public CoreCourse(String title, YearOfStudy year, Instructor instructor, Assistant assistant){
        super(title, year, instructor);
        this.assistant = assistant;
    }


    @Override
    public String getTitle() {
        return super.getTitle() + " (core)";
    }
}
