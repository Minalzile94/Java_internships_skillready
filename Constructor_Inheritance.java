class Animal{
    Animal() {
        System.out.println("Animal Constructor");
    }
}
class dog extends Animal{
    dog(){
        System.out.println("dog Constructor");
    }
}
class Constructor_Inheritance{
    public static void main(String[] args) {
        dog d1=new dog();
        dog d2=new dog();
    }
}