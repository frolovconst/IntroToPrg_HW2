/**clearly
 * Created by Konstantin on 31.08.2016.
 */
public class LectureCourse {
    private String title;
    private YearOfStudy year;
    private Instructor instructor;
    private Assistant assistant;
    private boolean isCore;

    public  LectureCourse(String title, YearOfStudy year, Instructor instructor, Assistant assistant, boolean isCore){
        this.title = title;
        this.year = year;
        this.instructor = instructor;
        this.assistant = assistant;
        this.isCore = isCore;
    }

}
