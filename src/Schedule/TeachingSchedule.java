package Schedule;

import java.util.ArrayList;

/**
 * Created by Konstantin on 31.08.2016.
 */
public class TeachingSchedule {
    private ArrayList<TeachingWeek> weeks;

    public TeachingSchedule(TeachingWeek newWeek){
        weeks = new ArrayList<>();
        this.weeks.add(newWeek);
    }

    public void AddTeachingSchedule(TeachingWeek newWeek){
        this.weeks.add(newWeek);
    }

    public void DisplaySchedule(){
        for (TeachingWeek iterator:
                weeks) {
            iterator.DisplaySchedule();
        }
    }
}
