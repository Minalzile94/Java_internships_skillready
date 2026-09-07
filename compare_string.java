class compare_string {
    public static void main(String[] args) {
        //== operator
        String s1="JAVA";
        String s2="java";
        System.out.println(s1==s2);
        System.out.println(s1.equalsIgnoreCase(s2));
        //using equal method
        String s3=new String ("JAVA");
        String s4=new String ("JAVA");
        System.out.println(s3==s4);
        System.out.println("equal method = "+(s3.equals(s4)));

    }
    
}
