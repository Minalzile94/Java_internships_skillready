abstract class payment{
    abstract void pay();
}
class UPI extends payment{
    void pay(){
        System.out.println("payment done using UPI");
    }
}
class creditcard extends payment{
    void pay(){
        System.out.println("payment done using credit card");
    }
}
class Abstraction2 {
    public static void main(String[] args) {
        payment p1=new UPI();
        p1.pay();
        payment p2=new creditcard();
        p2.pay();
    }
}
