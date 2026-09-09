
import java.util.Scanner;

class ComparePassword {
    public static void main(String[] args) {
        Scanner s1=new Scanner (System.in);
        System.out.println("enter 1st password:");
        String password=s1.nextLine();
        System.out.println ("enter 2nd password:");
        String confpass=s1.nextLine();
        // String password="JAVA123";
        // String confpass="JAVA123";
        System.out.println(password==confpass);
        System.out.println("using function="+password.equals(confpass));
    }
    
}
