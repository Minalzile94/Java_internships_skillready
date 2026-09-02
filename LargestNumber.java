class LargestNumber {
    public static void main(String[] args) {
        int a[]={45,12,89,34,67};
        int largestelement=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>largestelement){
                largestelement=a[i];
            }
        }
        System.out.println("largest number = "+largestelement);
    }
    
}
