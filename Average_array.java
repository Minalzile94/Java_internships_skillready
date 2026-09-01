//find the average of array

class Average_array {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        int addition=0;
        for(int i=0;i<a.length;i++){
            addition=addition+a[i];
        }
        System.out.println("total value of array:"+addition);
        double findaverage=addition/a.length;
        System.out.println("average = "+findaverage);
    }
    
}
