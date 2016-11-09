package People;
import Basics.*;
import Lessons.LectureCourse;


/**
 * Created by Konstantin on 08.09.2016.
 */
public abstract class Person {
    protected Name name;
    private LectureCourse[] lectures;

    public void DisplayName(){
        System.out.println(name.getFirstName() + " " + name.getLastName());
    }

    public void setName(Name name){
        this.name = name;
    }

    public Name getName(){
        return this.name;
    }

    public Person(Name name){
        this.name = name;
    }

    public boolean addCourse(LectureCourse lectureCourse){
        return false;
    }

    public boolean removeCourse(LectureCourse lectureCourse){
        return false;
    }
}
