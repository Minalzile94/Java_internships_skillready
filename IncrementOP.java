class IncrementOP {
    public static void main(String[] args) {
        int a=10;
        a++;
        int b=0;
        b--;
        System.out.println("value of b="+b);
        System.out.println("value of a="+a);
        System.out.println(a++ + a++);
        System.out.println("value of a="+a);
        System.out.println(a++ - ++a + --a);
        System.out.println(b++ + ++b + b--);

    }
    
}
