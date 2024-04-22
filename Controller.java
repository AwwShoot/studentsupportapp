import java.text.DateFormat;
import java.util.Date;

public class Controller {
    static boolean appOpen = true;
    public static void main(final String[] args) {
        Appointments appointments = new Appointments();
        GUI menu = new GUI();
        FIT academic = new SSSC();
        FIT health = new HealthCenter();
        while (appOpen) {
            String inputData = menu.nextInput();
            // Since the data is dummy data, the if statements are also dummy
            if (inputData.equals("Health Appt")) {
                Appointment appt = new HealthAppointment(menu.nextInput(), menu.nextInput(),
                    new Date(menu.nextInput()), Integer.parseInt(menu.nextInput()), Integer.parseInt(menu.nextInput())
                    );
                if (health.send(appt)) {
                    menu.display("appointment successfully scheduled");
                } else {
                    menu.display("Appointment failed. Try another time");
                }

            }
            if (inputData.equals("Academic Appt")) {
                Appointment appt = new AcademicAppointment(menu.nextInput(), menu.nextInput(), menu.nextInput(),
                    new Date(menu.nextInput()), Integer.parseInt(menu.nextInput()), Integer.parseInt(menu.nextInput())
                );
                if (academic.send(appt)) {
                    menu.display("appointment successfully scheduled");
                } else {
                    menu.display("Appointment failed. Try another time");
                }
            }
            if (inputData.equals("health days")) {
                menu.display(health.get("days"));
            }
            if (inputData.equals("academic days")) {
                menu.display(academic.get("days"));
            }
            if (inputData.equals("health times")) {
                menu.display(health.get(menu.nextInput()));
            }
            if (inputData.equals("health times")) {
                menu.display(health.get(menu.nextInput()));
            }
        }
    }
}
