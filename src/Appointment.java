public class Appointment {
    private String name;
    private String mobilePhone;
    private String preferredTime;

    private HealthProfessional selectedDoctor;

    public Appointment() {
        //default constrator
    }

    public Appointment(String name, String mobilePhone, String preferredTime, HealthProfessional selectedDoctor) {
        this.name = name;
        this.mobilePhone = mobilePhone;
        this.preferredTime = preferredTime;
        this.selectedDoctor = selectedDoctor;
    }

    public void printDetail() {
        System.out.println("The appointment details are:");
        System.out.println("Name: " + this.name);
        System.out.println("Phone Number: " + this.mobilePhone);
        System.out.println("===========Doctor Detail==========");
        this.selectedDoctor.printHealthProfessional();
    }


}
