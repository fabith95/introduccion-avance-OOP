import sun.util.locale.provider.AvailableLanguageTags;
import ui.User;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    private String speciality;

    Doctor(String name, String email){
        super(name, email);
        System.out.println("Doctor asignado es:" + name + " " + speciality);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString(){
        return super.toString() + "Speciality: " + getSpeciality() + "\nspecialityavailable: " + availableAppointments.toString();
    }





    //Encapsulamos para que el doctor proporcione citas
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString(){
            return "\nAvailableAppointment: " + "Date: " + getDate() + ", Time: " + getTime();
        }
    }
}
