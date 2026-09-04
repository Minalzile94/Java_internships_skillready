
import java.util.Scanner;

class Runtime2D {
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter values for array:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=s1.nextInt();
            }
        }
        System.out.println("your arrays value are: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
}
