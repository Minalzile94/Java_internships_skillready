//two dimentional arrays==>
// [] []==>[row] [column]
// [col] [row]==> row'wise 1 2 3 row wise col
 
class TwoD {
    public static void main(String[] args) {
        int a[][]={{1,2,3},
                   {4,5,6},
                   {7,8,9}};
                   for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        System.out.print(a[i][j] + " ");
                    }
                    System.out.println();
                   }
                }
}
