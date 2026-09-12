class Constructor_data {
    public Constructor_data(String name,int age) {
        name=name;
        age=age;
        System.out.println("name = "+name);
        System.out.println("age "+age);
    }
    public static void main(String[] args) {
        Constructor_data c1=new Constructor_data("MINAL",20);
    }
}