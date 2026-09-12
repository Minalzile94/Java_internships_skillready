class Constructor_data2 {
    String name;
    int age;
    //parametrized constructor
    public Constructor_data2(String name,int age){
        this.name = name;
        this.age = age;
    }
    void print_construtor(String name,int age){
        System.out.println("name = "+name);
        System.out.println("age "+age);
    }
    public static void main(String[] args) {
    Constructor_data2 c1 = new Constructor_data2("MINAL",20);
        c1.print_construtor("ANU",22);
    }
}

 