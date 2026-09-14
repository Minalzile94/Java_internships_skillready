class animal{
    void eat(){
        System.out.println("animal is eating");
    }
}
class DOg extends animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}
class single_inheritance{
    public static void main(String[] args) {
        DOg d=new DOg();
        d.eat();
        d.bark();        
    }
}

