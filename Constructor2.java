class Constructor2 {

    Constructor2() {
        System.out.println("Constructor call");

    }
    void printdata(){
        System.out.println("its a method");

    }
    public static void main(String[] args) {
    Constructor2 c1 = new Constructor2();
    Constructor2 c2 = new Constructor2();
    c1.printdata();
    }
}