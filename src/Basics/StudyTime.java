package Basics;

/**
 * Created by Konstantin on 27.10.2016.
 */
public class StudyTime {
    String dayOfWeek;
    String hours;
    String minutes;

    public StudyTime(String dayOfWeek, String hours, String minutes) {
        this.dayOfWeek = dayOfWeek;
        this.hours = hours;
        this.minutes = minutes;
    }

    public String GetSchedule(){
        return dayOfWeek + " " + hours + ":" + minutes;
    }

    public String getDayOfWeek() {

        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }
}
