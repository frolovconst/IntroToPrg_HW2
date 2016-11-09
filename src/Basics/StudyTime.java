package Basics;

/**
 * Created by Konstantin on 27.10.2016.
 */
public class StudyTime {
    String dayOfWeek;
    int hours;
    int minutes;

    public StudyTime(String dayOfWeek, int hours, int minutes) {
        assert hours >= 9 && hours <=18 : "Non business time";
        assert minutes >= 0 && minutes <=59 : "Wrong value for minutes";
        this.dayOfWeek = dayOfWeek;
        this.hours = hours;
        this.minutes = minutes;
    }

    public String GetSchedule(){
        return dayOfWeek + " " + String.format("%02d", hours) + ":" + String.format("%02d", minutes) ;
    }

    public String getDayOfWeek() {

        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
