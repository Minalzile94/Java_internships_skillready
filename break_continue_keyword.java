class break_continue_keyword {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            if(i==3){
                System.out.println("skipping ="+i);
                continue;
            }
            if(i==8){
                System.out.println("loop stopped at "+i);
                break;
            }
            System.out.println("number = "+i);
        }
        System.out.println("end the loop");
    }
    
}
