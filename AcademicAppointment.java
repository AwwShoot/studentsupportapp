import java.util.Date;

public class AcademicAppointment extends Appointment {
    public AcademicAppointment(String name, String faculty, String course, Date day, int timeStart, int timeEnd){
        this.data = faculty + " " + course;
        this.name = name;
        this.day = day;
        this.timeEnd = timeEnd;
        this.timeStart = timeStart;
    }

}
