
import java.util.Scanner;

class voting{
    //string country="india";
    public static void main(String[] args) {
        Scanner s1=new Scanner (System.in);
        System.out.println("enter your country:");
        String country=s1.nextLine();
        System.out.println("enter your age;");
        int age=s1.nextInt();
        if (country.equals("india")){
            if(age>=18){
                System.out.println("you are eligible for voting");
             } else {System.out.println ("age is not satisfied");} 
            } else {System.out.println ("not eligible because country are not matched");}
              }
}