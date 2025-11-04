public class AssignmentOne {
    public static void main(String[] args) {
        HealthProfessional h1 = new HealthProfessional(123,"abc");
        System.out.println(h1.toString());
        System.out.println("id"+ h1.getId() + ", name:"+h1.getName());
    }
}