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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPreferredTime() {
        return preferredTime;
    }

    public void setPreferredTime(String preferredTime) {
        this.preferredTime = preferredTime;
    }

    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    public void setSelectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }
}
