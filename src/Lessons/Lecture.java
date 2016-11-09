package Lessons;
import Basics.StudyTime;
import Facilities.*;
import java.util.Date;

/**
 * Created by Konstantin on 31.08.2016.
 */
public class Lecture {
    private Auditorium room;
    private LectureCourse course;
    private StudyTime schedule;

    public Lecture(Auditorium room, LectureCourse course, StudyTime schedule){
        this.course = course;
        this.room = room;
        this.schedule = schedule;
    }

    public StudyTime getSchedule() {
        return schedule;
    }

    public void setSchedule(StudyTime schedule) {
        this.schedule = schedule;
    }

    public void DisplaySchedule(){
        System.out.println(schedule.GetSchedule() + " - " + course.getTitle() + " - " + room.getRoomNo() );
    }
}
