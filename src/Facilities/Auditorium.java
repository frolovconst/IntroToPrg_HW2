package Facilities;

import Basics.StudyTime;

import java.util.ArrayList;

/**
 * Created by Konstantin on 31.08.2016.
 */
public class Auditorium {
    private ArrayList<StudyTime> occupiedTimes;
    private int roomNo;

    public Auditorium(StudyTime occupiedTimes, int roomNo) {
        this.occupiedTimes = new ArrayList<>();
        this.occupiedTimes.add(occupiedTimes);
        this.roomNo = roomNo;
    }

    public ArrayList<StudyTime> getOccupiedTimes() {
        return occupiedTimes;
    }

    public void addOccupiedTimes(StudyTime occupiedTime) {
        this.occupiedTimes.add(occupiedTime);
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }
}
