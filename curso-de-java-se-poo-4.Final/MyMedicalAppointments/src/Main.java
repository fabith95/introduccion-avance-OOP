import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("fabith", "fabith95@hmail.co");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "8pm");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

//        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()
//             ) {
//            System.out.println(aA.getDate() + " " + aA.getTime());
//        }

        System.out.println();

        Patient patient = new Patient("stiven", "stiven95@gmail.com");
        System.out.println(patient);


    }



}
