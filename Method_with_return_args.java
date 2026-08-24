
import java.util.Scanner;

class Method_with_return_args {
    static double addition(int a,int b){
    return a+b;
    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the value for X and Y:");
        int X=s1.nextInt();
        int Y=s1.nextInt();
        System.out.println(addition(X,Y));
    }
    }
        
    

