
import java.util.Scanner;

//blood donation conditions
// weight==>60 or 60+ male candidate
// female==>50 or 50+
// gender==>male female
// age==>18 or 18+
// disease==> no sugar/diabeties HIV 
class blood_donation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter gender(male/female):");
        String gender=sc.nextLine();
        System.out.println("enter age:");
        int age=sc.nextInt();
        System.out.println("enter weight(kg):");
        int weight=sc.nextInt();
        sc.nextLine();
        System.out.println("do you have diabetes?(yes/no)");
        String disease=sc.nextLine();
        if(age>=18){
            if(disease.equalsIgnoreCase("no")){
                if(gender.equalsIgnoreCase("male")&& weight>=60){
                    System.out.println("you are eligible for blood donation");
                }
                else if(gender.equalsIgnoreCase("female")&& weight>=50){
                    System.out.println("you are eligible for blood donation");
                }
            else{System.out.println("you are not eligible due to insufficient weight"); }
            }else{System.out.println("you are not eligible due to diabetes");}
        }else{System.out.println("you are not eligible because age is below 18");}
        sc.close();
    }

    
}
