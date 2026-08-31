//take the array and print the addition of array elements
// 1 2 3 4 5==>15
class ArrayAdd {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int addition=0;
        for(int i=0;i<5;i++){
            addition=addition+a[i];
            System.out.println(a[i]+" ");
        }
        System.out.println("addition = "+addition);
    }
    
}
