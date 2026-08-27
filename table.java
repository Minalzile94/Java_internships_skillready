
import java.util.Scanner;

//print the table of 5
class table {
    public static void main(String[] args) {
        int i=1;
        int number;
        Scanner s1=new Scanner(System.in);
        System.out.println("enter any number for print the table");
        number=s1.nextInt();
        while(i<=10){
            System.out.println(i*number);
            i++;
        }
    }
    
}
