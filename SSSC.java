public class SSSC implements FIT{

    // dummy data
    String[] availableDays = {"4/22/24", "4/23/24"};
    int[] availableTimes = {1, 23, 8, 18}; // Start and end times for each day in order.
    @Override
    public String get(String query) {
        if (query.equals("days")) {
            String output = "";
            for (int i = 0; i < availableDays.length; i++) {
                output = output+availableDays[i];
            }
            return output;
        }
        for (int i = 0; i < availableDays.length; i++) {
            if (query.equals(availableDays[i])) {
                return availableTimes[i*2] + "" + availableTimes[i*2+1];
            }
        }
        return "invalid query";
    }

    public boolean send(Appointment appt) {
        System.out.println("Sending the appointment to the Health Center");
        for (int i = 0; i < availableDays.length; i++) {
            if (appt.day.equals(availableDays[i])) {
                if (appt.timeStart >availableTimes[i*2] && appt.timeEnd < availableTimes[i*2 +1]) {
                    return true;
                }
            }
        }
        return false;
    }
}
