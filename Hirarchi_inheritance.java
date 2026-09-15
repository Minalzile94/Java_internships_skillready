class animal{
    void eat(){System.out.println("Eating");}
}
class dog extends animal{
    void bark(){System.out.println("dog is barking");}
}
class cat extends animal{
    void meow(){System.out.println("cat meow");}
}
class Hirarchi_inheritance {
    public static void main(String[] args) {
        cat c1=new cat();
        c1.eat();
        c1.meow();
        dog d1=new dog();
        d1.eat();
        d1.bark();
    }

    
}
