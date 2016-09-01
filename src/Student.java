/**
 * Created by Konstantin on 31.08.2016.
 */
public class Student {
    private Name name;
    private YearOfStudy yearOfStudy;
    private LectureCourse[] lectures;

    public void setName(Name name){
        this.name = name;
    }

    public Name getName(){
        return this.name;
    }

    public boolean addCourse(LectureCourse lectureCourse){
        return false;
    }

    public boolean removeCourse(LectureCourse lectureCourse){

        return false;
    }

    public Student(Name name){
        this.name = name;
    }
}
