class FirstMethod {
   static int a=10;
    static void addition(){
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println("addition="+c);
    }
    public static void main(String[] args) {
        FirstMethod obj1=new FirstMethod();
        //call the method
        addition();//static keyword output
        obj1.addition();//object output
        System.out.println("value of a ="+ a);
    }
    }
    
