/**
 * Created by Konstantin on 31.08.2016.
 */
public class University {
    private Student[] students;
    private Assistant[] assistants;
    private Instructor[] instructors;
    private LectureCourse[] Courses;
    private TeachingSchedule schedule;

    public void addStudent(Student student){
        this.students[this.students.length] = student;
    }

    public void addAssistant(Assistant assistant){
        this.assistants[this.assistants.length] = assistant;
    }

    public Assistant getdAssistant(){
        return this.assistants[0];
    }

    public void addInstructor(Instructor instructor){
        this.instructors[this.instructors.length] = instructor;
    }

    public Instructor getInstructor(){
        return this.instructors[0];
    }

    public void addLectureCourse(LectureCourse lectureCourse){
        this.Courses[this.Courses.length] = lectureCourse;
    }

    public LectureCourse getLectureCourse(){
        return this.Courses[0];
    }

    public void setSchedule(TeachingSchedule newSchedule){
        this.schedule = newSchedule;
    }
}
