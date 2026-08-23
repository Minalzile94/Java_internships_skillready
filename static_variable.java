class static_variable {
    static int a=100;
    static {a=a+20;}//120 static method using only static keyword
    public static void main(String[] args) {
        System.out.println("value of a = " + a);
    }
    
}
