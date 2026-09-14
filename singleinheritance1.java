class person{
    String name="Vishakha";
    void print (){System.out.println("name = "+name);}

}
class Student extends person{
    int rollno = 1122;
    void print_rollno(){System.out.println("rollno ="+rollno);}

    }
    class singleinheritance1 {
        public static void main(String[] args) {
            Student s1=new Student();
            s1.print();
            s1.print_rollno();
        }
    }