
import java.util.Scanner;

//search the element from array
// 1 2 3 4 5 6==> 5 6
class search_element {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        Scanner s1=new Scanner(System.in);
        System.out.println("enterm search element in array:");
        int search_value=s1.nextInt();
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==search_value){
                j=1;
                break;
            }
        }
        if(j==1){System.out.println("number is available");}
        else{System.out.println("number is not available");}
    }
    
}
