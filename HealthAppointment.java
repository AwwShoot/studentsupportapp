import java.util.Date;

public class HealthAppointment extends Appointment {
    public HealthAppointment(String name, String data, Date day, int timeStart, int timeEnd){
        this.data = data;
        this.name = name;
        this.day = day;
        this.timeEnd = timeEnd;
        this.timeStart = timeStart;
    }
}
