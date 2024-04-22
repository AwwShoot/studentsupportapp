public class Appointments {
    public static Appointment[] activeAppts = new Appointment[10];
    public void add(Appointment appt){
        for (int i = 0; i < 10; i++) {
            if (activeAppts[i] == null) {
                activeAppts[i] = appt;
                return;
            }
        }
        System.out.println("Too many appointments");
    }
    public void remove(Appointment appt) {
        for (int i = 0; i < 10; i++) {
            if (activeAppts[i] != null && activeAppts[i].name == appt.name) {
                activeAppts[i] = null;
            }
        }
    }
}
