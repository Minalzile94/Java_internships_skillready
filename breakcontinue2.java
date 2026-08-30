//write a program to print odd number using break and continue
// from 1 to 20 if the range value is 15 the stop it

class breakcontinue2 {
    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
            if(i%2==0){
                continue;
            }
            if(i>15){break;}
            System.out.println("odd num ="+i);
            }
        }
    }
    