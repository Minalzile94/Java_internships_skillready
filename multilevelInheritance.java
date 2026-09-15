class animal{
    void eat(){System.out.println("Eating");}
}
class  mammal extends animal{
    void walk(){System.out.println("walking");}
}
class dog extends mammal{
    void bark(){System.out.println("dog is barking");}
}

class multilevelInheritance {
    public static void main(String[] args) {
        dog d1=new dog();
        d1.eat();
        d1.walk();
        d1.bark();
    }
    
}
