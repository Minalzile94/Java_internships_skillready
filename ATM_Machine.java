class ATM_Machine {
    String bankname;
    int balance;
    public ATM_Machine() {
        bankname="SBI";
        balance=50000;
        System.out.println("ATM MACHINE IS STARTED ");}
    void printATM(){
        System.out.println(bankname);
        System.out.println(balance);}
    public static void main(String[] args) {
        ATM_Machine atmobj = new ATM_Machine();
        atmobj.printATM();
    }        

    
}
