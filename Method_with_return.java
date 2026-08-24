

class Method_with_return {
    int addition(){
        int a=70;
        int b=20;
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        Method_with_return m3=new Method_with_return();
        System.out.println("addition="+m3.addition());
    }
}
