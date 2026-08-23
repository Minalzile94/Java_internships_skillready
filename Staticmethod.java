    //Static method are not override other than that
    //static method are always hide
    class Demo {
    static void print() {
        System.out.println("parent");
    }
}
    class Staticmethod extends Demo {
    static void print() {
        System.out.println("child");
    } 
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.print();
        Staticmethod s1 = new Staticmethod();
        s1.print();
    }
}

