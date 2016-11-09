import Lessons.Lecture;
import Lessons.LectureCourse;
import People.Assistant;
import People.Instructor;
import People.Student;
import Schedule.TeachingSchedule;

import java.util.ArrayList;

/**
 * Created by Konstantin on 31.08.2016.
 */
public class University {
    private ArrayList<Student> students;
    private ArrayList<Assistant> assistants;
    private ArrayList<Instructor> instructors;
    private ArrayList<LectureCourse> courses;
    private TeachingSchedule schedule;

    public void addStudent(Student student){
        this.students.add(student);
    }

    public Student getStudentByIndex(int index){
        return students.get(index);
    }

    public University() {
        students = new ArrayList<>();
        assistants = new ArrayList<>();
        instructors = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void getProfessors(){
        System.out.println("Innopolis Professors:");
        for (Instructor iterator:
             instructors) {
            iterator.DisplayName();

        }
    }

    public void addAssistant(Assistant assistant){
        this.assistants.add(assistant);
    }

    public Assistant getdAssistant(){
        return this.assistants.get(0);
    }

    public void addInstructor(Instructor instructor){
        this.instructors.add(instructor);
    }

    public Instructor getInstructor(){
        return this.instructors.get(0);
    }

    public void addLectureCourse(LectureCourse lectureCourse){
        this.courses.add(lectureCourse);
    }

    public LectureCourse getLectureCourse(){
        return this.courses.get(0);
    }

    public void setSchedule(TeachingSchedule newSchedule){
        this.schedule = newSchedule;
    }

    public void DisplaySchedule(){
        System.out.println("University timetable:");
        schedule.DisplaySchedule();
    }
}
