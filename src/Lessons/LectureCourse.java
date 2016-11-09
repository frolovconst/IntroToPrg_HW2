package Lessons;

import People.Assistant;
import People.Instructor;
import Basics.YearOfStudy;

/**clearly
 * Created by Konstantin on 31.08.2016.
 */
public abstract class LectureCourse {
    private String title;
    private YearOfStudy year;
    private Instructor instructor;

    public  LectureCourse(String title, YearOfStudy year, Instructor instructor){
        this.title = title;
        this.year = year;
        this.instructor = instructor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
