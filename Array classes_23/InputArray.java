package lactNo23Pw;

import java.util.Scanner;

public class InputArray {
    static void printArray(int [][]arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(i+",");
                System.out.print(j + " = ");
                System.out.print(arr[i][j]+ " ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of  row and coll of  an array");

        int R = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[R][c];
        System.out.println("Enter the element of an array");
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
               arr[i][j]= sc.nextInt();
            }
        }
printArray(arr);
    }
}
