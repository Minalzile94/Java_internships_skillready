
class Method_with_argument {
    void addition(int a,int b){
        int c=a+b;
        System.out.println("adition="+c);
    }
    public static void main(String[] args) {
        Method_with_argument m2 = new Method_with_argument();
        m2.addition(10,20);
    }
}
