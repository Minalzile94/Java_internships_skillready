//find the even odd number from the range 1 to 20
 class while_loop2 {
    public static void main(String[] args) {
        int i=1;
        while(i<=20){
            if(i%2==0){
                System.out.println("even number="+i);
            }else{
                System.out.println("odd number"+i);
            }
            i++;
        }
    }
    
}
