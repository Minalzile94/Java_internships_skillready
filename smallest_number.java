class smallest_number {
    public static void main(String[] args) {
        int a[]={46,12,45,10,66};
        int smallest_element=a[0];
        for(int i=0;i<a.length;i++){
            if(smallest_element>a[i]){
                smallest_element=a[i];
            }
        }
            System.out.println("smallest number = "+smallest_element);
        }
        
    }
    
