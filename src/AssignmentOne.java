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


        System.out.println("=== The health professional details are: ===");

        // 测试全科医生
        System.out.println("GeneralPractitioner:");
        GeneralPractitioner gp1 = new GeneralPractitioner(); // 默认构造函数
        gp1.printHealthProfessional();

        System.out.println(); // 空行

        GeneralPractitioner gp2 = new GeneralPractitioner(01, "Dr.Zhang", 45, true);
        gp2.printHealthProfessional();

        System.out.println("Cardiologist:");
        Cardiologist cardio1 = new Cardiologist(); // 默认构造函数
        cardio1.printHealthProfessional();

        System.out.println(); // 空行

        Cardiologist cardio2 = new Cardiologist(002, "Dr.Li", 46, "Cardiology Department");
        cardio2.printHealthProfessional();


    }
}