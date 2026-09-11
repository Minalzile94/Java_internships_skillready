
//create a class using class keyword
//keyword means reserve words

class DemoClass {
    int a=10;
    int b=20;
    int c=a+b; 
    public static void main(String[] args) {
        //create a object to the class
        DemoClass obj = new DemoClass();
        DemoClass obj2 = new DemoClass();
        System.out.println("addition = "+obj.c);
        System.out.println("Addition2 = "+obj2.c);
    }
}