//sum of elements from 1 to 10
class forloop2 {
    //class data member static int addition=0; static=constant
    ///pi=3.14
     int addition2=0;  
    public static void main(String[] args) {
        forloop2 f1 = new forloop2();
        int addition=0;
        for(int i=1;i<=10;i++){
            f1.addition2=f1.addition2+i;
            //addition2;
            addition=addition+i;
            System.out.println("i");
        }
        System.out.println("addition=" + addition);
        System.out.println("addition2=" + f1 .addition2);
    }

    
}
