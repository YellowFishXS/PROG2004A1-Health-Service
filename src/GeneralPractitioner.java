import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * Child class GeneralPractitioner extends base class
 */
public class GeneralPractitioner extends HealthProfessional {
    //Distinguish general practitioners from other types
    private boolean isGeneralPractitioner;

    /**
     * default constructor
     */
    public GeneralPractitioner() {
        super();
        this.isGeneralPractitioner = true;
        System.out.println("A default general practitioner object has been created");
    }

    public GeneralPractitioner(int id, String name, int Age, boolean isGeneralPractitioner){
        // Call the constructor of the base class
        super(id, name, Age);
        this.isGeneralPractitioner = isGeneralPractitioner;
        System.out.println("created GeneralPractitioner name: " + name);
    }

    /**
     * overriding the method of the parent class
     */
    @Override
    public void printHealthProfessional() {
        System.out.println("=== The health professional details are:===");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        if (isGeneralPractitioner) {
            System.out.println("He/She is a general practitioner");
        } else
            System.out.println("He/She is not a general practitioner");
        System.out.println("========================");
    }

    public boolean isGeneralPractitioner() {
        return isGeneralPractitioner;
    }

    public void setGeneralPractitioner(boolean generalPractitioner) {
        isGeneralPractitioner = generalPractitioner;
    }
}
