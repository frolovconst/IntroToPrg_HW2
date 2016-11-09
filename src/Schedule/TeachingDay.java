package Schedule;

import Lessons.Lecture;

import java.util.ArrayList;

/**
 * Created by Konstantin on 31.08.2016.
 */
public class TeachingDay {
    private ArrayList<Lecture> lectures;

    public TeachingDay(Lecture lecture){
        lectures = new ArrayList<>();
        this.lectures.add(lecture);
    }

    public void AddLecture(Lecture lecture){
        this.lectures.add(lecture);
    }

    public void DisplaySchedule(){
        for (Lecture iterator:
             lectures) {
            iterator.DisplaySchedule();
        }
    }

}
