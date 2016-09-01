import java.time.Year;

public class Main {

    public static void main(String[] args) {
	    University myUniversity = new University();
        myUniversity.addStudent(new Student(new Name("Vinicius", "Woodlet")));

        myUniversity.addAssistant(new Assistant(new Name("Mona", "Yeganegi")));
        myUniversity.addInstructor(new Instructor(new Name("Rodrigo", "Kawadze")));
        LectureCourse mewCourse = new LectureCourse("Boxes opening",
                YearOfStudy.BS2, myUniversity.getInstructor(),
                myUniversity.getdAssistant(),
                true);
        myUniversity.addLectureCourse(mewCourse);

        Auditorium someAud = new Auditorium();
        Lecture someLect = new Lecture(someAud, mewCourse);
        TeachingDay newTeachingDay = new TeachingDay(someLect);
        TeachingWeek firstWeek = new TeachingWeek(newTeachingDay);
        TeachingSchedule testTeachingSchedule = new TeachingSchedule(firstWeek);

        myUniversity.setSchedule(testTeachingSchedule);




    }
}
