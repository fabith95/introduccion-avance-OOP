
public class Doctor {
    //Atributos
    static int id = 0; //Autoincrement
    String name;
    String email;
    String speciality;

    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
        id++;
    }

    Doctor(String name, String speciality){
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }



}
