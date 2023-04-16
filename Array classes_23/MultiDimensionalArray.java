package lactNo23Pw;

public class MultiDimensionalArray {
    static void printarr(int[][] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] arr  = new int[2][3];
        arr[0][0]=23;
        arr[0][1]=22;
        arr[0][2]=34;
        arr[1][0]=94;
        arr[1][1]=24;
        arr[1][2]=89;
      printarr(arr);
    }
}
