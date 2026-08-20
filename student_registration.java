
import java.util.Scanner;

 class student_registration {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("====STUDENT REGISTRATION FOR====");
        System.out.println("enter student name:");
        String name=s1.nextLine();
        System.out.println("enter student age:");
        int age=s1.nextInt();
        System.out.println("enter 12th percentage:");
        double percentage= s1.nextDouble();
        System.out.println("enter grade:");
        char grade=s1.next().charAt(0);
        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.println("percentage="+percentage);
        System.out.println("grade="+grade);

    }
}
