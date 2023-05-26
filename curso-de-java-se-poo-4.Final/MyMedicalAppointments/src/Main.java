import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("fabith", "pediatria");

        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("stiven", "stiven95@gmail.com");

        patient.setHeight(1.7);
        System.out.println(patient.getHeight());

        patient.setWeight(75);
        System.out.println(patient.getWeight());

    }



}
