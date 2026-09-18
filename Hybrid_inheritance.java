interface A {void print();}
interface B {void printB();}
class C implements A,B{
    public void print(){System.out.println("print method");}
    public void printB(){
        System.out.println("print b class method");
    }
    }
class Hybrid_inheritance {
    public static void main(String[] args) {
        C object = new C();
        object.print();
        object.printB();
    }

    
}
