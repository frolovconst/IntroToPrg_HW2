import Basics.Name;
import Basics.StudyTime;
import Basics.YearOfStudy;
import Facilities.Auditorium;
import Lessons.CoreCourse;
import Lessons.ElectiveCourse;
import Lessons.Lecture;
import Lessons.LectureCourse;
import People.*;
import Schedule.TeachingDay;
import Schedule.TeachingSchedule;
import Schedule.TeachingWeek;

import java.util.Date;
//import People.Instructor;
//import People.Student;

public class Main {

    public static void main(String[] args) {
        University myUni = new University();
        GenerateLectureCourses(myUni);
        myUni.DisplaySchedule();
        System.out.println();
        myUni.getProfessors();
        System.out.println();
        myUni.getStudentByIndex(0).DisplayStudSchedule();
    }

    private static void GenerateLectureCourses(University myUni){
        //Auditoriums


        //monday
        //DSA lecture
        Instructor DSAInstructor = new Instructor(new Name("Alexander", "Klimchik"));
        myUni.addInstructor(DSAInstructor);
        Assistant DSAAssistant = new Assistant(new Name("Igor", "Danilov"));
        myUni.addAssistant(DSAAssistant);
        LectureCourse DSACourse = new CoreCourse("Algorithms and Data Structures", YearOfStudy.MS1, DSAInstructor, DSAAssistant);
        StudyTime DSASchedule = new StudyTime("Monday", "09", "00");
        Auditorium aud108 = new Auditorium(DSASchedule, 108);
        Lecture DSALecture = new Lecture(aud108, DSACourse, DSASchedule);
        TeachingDay monday = new TeachingDay(DSALecture);

        //Wednesday
        //Database lecture
        Instructor DBaseInstructor = new Instructor(new Name("Mohammad", "Kassab"));
        myUni.addInstructor(DBaseInstructor);
        Assistant DBaseAssistant = new Assistant(new Name("Bulat", "Gabbasov"));
        myUni.addAssistant(DSAAssistant);
        LectureCourse DBaseCourse = new CoreCourse("Data Modelling and Databases", YearOfStudy.MS1, DBaseInstructor, DBaseAssistant);
        StudyTime DBaseSchedule = new StudyTime("Wednesday", "09", "00");
        Auditorium aud105 = new Auditorium(DBaseSchedule, 105);
        Lecture DBaseLecture = new Lecture(aud105, DBaseCourse, DBaseSchedule);
        TeachingDay wednesday = new TeachingDay(DBaseLecture);

        //Thursday
        //Programmming lecture
        Instructor ItPInstructor = new Instructor(new Name("Eugene", "Zuev"));
        myUni.addInstructor(ItPInstructor);
        Assistant ItpAssistant = new Assistant(new Name("Leonard", "Johard"));
        myUni.addAssistant(ItpAssistant);
        LectureCourse ItPCourse = new CoreCourse("Intoduction to Programming", YearOfStudy.MS1, ItPInstructor, ItpAssistant);
        StudyTime ItPSchedule = new StudyTime("Thursday", "09", "00");
        Lecture ItPLecture = new Lecture(aud105, ItPCourse, ItPSchedule);
        TeachingDay thursday = new TeachingDay(ItPLecture);

        //Friday
        //Comp Arch lecture
        Instructor CAAKInstructor = new Instructor(new Name("Alex", "Kostyushko"));
        myUni.addInstructor(CAAKInstructor);
        LectureCourse CAAKCourse = new ElectiveCourse("Computer Architecture for System Developer", YearOfStudy.MS1, CAAKInstructor);
        StudyTime CAAKSchedule = new StudyTime("Friday", "10", "00");
        Auditorium aud308 = new Auditorium(DSASchedule, 308);
        Lecture CAAKLecture = new Lecture(aud308, CAAKCourse, CAAKSchedule);
        TeachingDay friday = new TeachingDay(CAAKLecture);

        //week
        TeachingWeek week1 = new TeachingWeek(monday);
        week1.AddTeachingDay(wednesday);
        week1.AddTeachingDay(thursday);
        week1.AddTeachingDay(friday);
        TeachingSchedule fall2016 = new TeachingSchedule(week1);

        myUni.setSchedule(fall2016);

        //students
        Student muppleStudent = new Student(new Name("Constantine", "Frolov"));
        muppleStudent.SetTeachingSchedule(fall2016);
        myUni.addStudent(muppleStudent);
    }

    private static void FillingInTestInfo(){
        University myUniversity = new University();
        myUniversity.addStudent(new Student(new Name("Vinicius", "Woodlet")));
        myUniversity.addAssistant(new Assistant(new Name("Mona", "Yeganegi")));
        myUniversity.addInstructor(new Instructor(new Name("Rodrigo", "Kawadze")));
        CoreCourse mewCourse = new CoreCourse("Boxes opening",
                YearOfStudy.BS2, myUniversity.getInstructor(),
                myUniversity.getdAssistant());
        myUniversity.addLectureCourse(mewCourse);
        Auditorium someAud = new Auditorium(new StudyTime("Monday", "09", "00"), 108);
        Lecture someLect = new Lecture(someAud, mewCourse, new StudyTime("Monday", "09", "00"));
        TeachingDay newTeachingDay = new TeachingDay(someLect);
        TeachingWeek firstWeek = new TeachingWeek(newTeachingDay);
        TeachingSchedule testTeachingSchedule = new TeachingSchedule(firstWeek);

        myUniversity.setSchedule(testTeachingSchedule);
    }
}
