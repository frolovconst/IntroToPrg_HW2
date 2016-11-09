package Schedule;

import Schedule.TeachingDay;

import java.util.ArrayList;

/**
 * Created by Konstantin on 31.08.2016.
 */
public class TeachingWeek {
//    private TeachingDay[] teachingWeek;// monday;
    private ArrayList<TeachingDay> days;
//    private TeachingDay wednesday;
//    private TeachingDay thursday;
//    private TeachingDay friday;
//    private TeachingDay saturday;

    public TeachingWeek(TeachingDay firstDay){
        this.days = new ArrayList<>();
        days.add(firstDay);
    }

    public void AddTeachingDay(TeachingDay day){
        days.add(day);
    }

    public void DisplaySchedule(){
        for (TeachingDay iterator:
             days) {
            iterator.DisplaySchedule();
        }
    }
}
