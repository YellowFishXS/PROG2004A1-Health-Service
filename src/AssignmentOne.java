import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
//        HealthProfessional h1 = new HealthProfessional(123,"abc",35);
//        System.out.println(h1.toString());
//        h1.printHealthProfessional();
//
//        GeneralPractitioner g1 = new GeneralPractitioner();
//        g1.printHealthProfessional();
//
//        Cardiologist c1 = new Cardiologist(123,"abc",35,"bbb");
//        c1.printHealthProfessional();
        // Part 3 - Using classes and objects
        System.out.println("// Part 3 - Using classes and objects");

        // create three objects of General Practitioners
        GeneralPractitioner gp1 = new GeneralPractitioner(001, "Dr.Li", 45, true);
        GeneralPractitioner gp2 = new GeneralPractitioner(002, "Dr.Wang", 46, false);
        GeneralPractitioner gp3 = new GeneralPractitioner(003, "Dr.Zhang", 47, true);

        // two objects of the other health professional type.
        Cardiologist cardio1 = new Cardiologist(004, "Dr.Wa", 53, "pediatric cardiologist");
        Cardiologist cardio2 = new Cardiologist(005, "Dr.Hua", 53, "cardiovascular surgeon");

        // print the details of all the health professionals
        System.out.println("========= GeneralPractitioner =========");
        gp1.printHealthProfessional();
        System.out.println();
        gp2.printHealthProfessional();
        System.out.println();
        gp3.printHealthProfessional();
        System.out.println();

        System.out.println("============ Cardiologist ============");
        cardio1.printHealthProfessional();
        System.out.println();
        cardio2.printHealthProfessional();

        System.out.println("-------------------------------------------------");


//       Part4 Appointment
        //split
        System.out.println();
        System.out.println("------------Part 4------------");
        Appointment ap1 = new Appointment("zhang", "123456","10:00",gp1);
        ap1.printDetail();


        // Part 5 – Collection of appointments
        ArrayList<Appointment> appointments = new ArrayList<>();
        System.out.println("------------Part 5------------");




    }


    
}