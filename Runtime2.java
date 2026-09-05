
import java.util.Scanner;

class Runtime2 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the size of row in array:");
        int row=s1.nextInt();
        System.out.println("enter the size of col in array:");
        int col=s1.nextInt();
        int a[][]=new int[row][col];
        System.out.println("enter values for array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=s1.nextInt();
            }
        }
        System.out.println("the 2D array is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(a[i][j]+ " ");
        }
        System.out.println();
    }
    }
}
