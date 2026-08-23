//when the class loads that time all the static blocks are exicuted from top to bottom
class static_priority{
    static {
        System.out.println("static block");
    }
    public static void main(String[] args) {
        System.out.println("main method block");
    }
    static {
        System.out.println("second static block");
    }
    }
    
