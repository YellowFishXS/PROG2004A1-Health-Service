/**
 * HealthProfessional - base class
 */
public class HealthProfessional {
    private int id;
    private String name;

    public HealthProfessional() {
        this.id = 0;
        this.name = "";
        System.out.println("create HealthProfessional");
    }

    /**
     *  Constructor for objects of class HealthProfessional
     * @param id
     * @param name
     */
    public HealthProfessional(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Constructor--HealthProfessional: " + name + " (ID: " + id + ")");
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