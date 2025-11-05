/**
 * Child class Cardiologist extends base class
 */
public class Cardiologist extends HealthProfessional {
    //Distinguish general practitioners from other types
    //pediatric cardiologist, cardiovascular surgeon
    private String cardiacSpecialty;


    /**
     * default constructor
     */
    public Cardiologist() {
        super();
        this.cardiacSpecialty = "Cardiovascular Surgeon";
    }

    // A second constructor that initialises all the instance variables
    public Cardiologist(int id, String name, int Age, String cardiacSpecialty){
        // Call the constructor of the base class
        super(id, name, Age);
        this.cardiacSpecialty = cardiacSpecialty;
//        System.out.println("created Cardiologist name: " + name);
    }


    /**
     * overriding the method of the parent class
     */
    @Override
    public void printHealthProfessional() {
        System.out.println("The health professional details are:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Cardiac Specialty: " + cardiacSpecialty);
    }




}
