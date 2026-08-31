
import java.util.Scanner;

class ArrayRuntime {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter size for array first");
        int size=s1.nextInt();
        int a[]=new int[size];
        System.out.println("enter 5 numbers for array:");
        for(int i=0;i<size;i++){
            a[i]=s1.nextInt();
        }
        int addition=0;
        for (int i=0;i<size;i++) {
            addition=addition+a[i];
            System.out.println(a[i]+" ");
        }  
        System.out.println("addition = "+addition); 
        }
    }
