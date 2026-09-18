abstract class shape{
    abstract void draw ();
}
class circle extends shape{
    void draw(){System.out.println("drawing circle");}
}
class rectangle extends shape{
    void draw(){
        System.out.println("drawing rectangle");
    }
}

class abstraction {
    public static void main(String[] args) {
        shape s1=new circle();s1.draw();
        shape s2=new rectangle();s2.draw();
        
    }
}