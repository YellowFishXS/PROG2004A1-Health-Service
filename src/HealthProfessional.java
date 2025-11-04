/**
 * HealthProfessional - base class
 */
public class HealthProfessional {
    private int id;
    private String name;
    private int age;


    //default constructor
    public HealthProfessional() {
        this.id = 0;
        this.name = "";
        this.age = 30;
        System.out.println("create HealthProfessional");
    }

    /**
     * Second Constructor for initialises all the instance variables.
     * @param id
     * @param name
     * @param age
     */
    public HealthProfessional(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("Constructor--HealthProfessional: " + name + " (ID: " + id + ")");
    }

    /**
     * prints all instance variables.
     */
    public void printHealthProfessional(){
        System.out.println("=== HealthProfessional===");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("==========================");
    }


    //access the properties
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //manipulate the properties
    public boolean setId(int id) {
        //perform input validation
        if (id>0){
            this.id = id;
        }else{
            System.out.println("input invalidation");
            return false;
        }
        return true;
    }

    public boolean setName(String name) {
        //perform input validation
        if ((name.length()>3) && (name.length()<10)){
            this.name = name;
        }else {
            System.out.println("input invalidation");
            return false;
        }
        return true;
    }

}