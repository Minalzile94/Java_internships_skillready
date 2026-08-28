//count digits in a number 1234==>6
class count_number {
    public static void main(String[] args) {
        int i=675453324;
        int count=0;
        while(i>0){
            count++;
            i/=10;
         }
         System.out.println("count number = "+count);
    }
    
}