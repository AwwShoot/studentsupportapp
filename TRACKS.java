public class TRACKS implements FIT{
    @Override
    public String get(String query) {
        return "Yep you logged in";
    }

    @Override
    public boolean send(Appointment appt) {
        return false;
    }
    public boolean send(String data){
        return true; // Don't even bother coding login stuff since that's out of our purview
    }
}
