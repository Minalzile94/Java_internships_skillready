
import java.util.Scanner;

class pizza_billing {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("welcome to pizza shop....");
        System.out.println("enter customer name:");
        String name=s1.nextLine();
        System.out.println("enter number of pizza:");
        int quantity= s1.nextInt();
        double priceperpizza = 399;
        double total_bill = quantity*priceperpizza;
        System.out.println("/n====BILL====");
        System.out.println("customer name:"+name);
        System.out.println("quantity of pizza:"+quantity);
        System.out.println("total bill = "+total_bill);
    }
    
}
