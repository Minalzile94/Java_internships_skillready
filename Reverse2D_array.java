//reverse the given 2D array
// 1 2 3 4 5 6 7 8 9==>9 8 7 6 5 4 3 2 1

class Reverse2D_array {
    public static void main(String[] args) {
        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("original array:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
            }
            System.out.println("reverse array:");
            for (int i = a.length-1;i>=0;i--){
                for(int j= a[i].length-1;j>=0;j--){
                    System.out.print(a[i][j] + " ");
                }
                System.out.println( );

            }
        }
    }