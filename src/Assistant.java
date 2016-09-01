/**
 * Created by Konstantin on 31.08.2016.
 */
public class Assistant {
    private Name name;
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

    public Assistant(Name name){
        this.name = name;
    }
}