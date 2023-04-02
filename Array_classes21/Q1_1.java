package lactNo21Pw;
//given an integer array a return the prefix sum runnig sum in the same array without creating a new array.
import java.util.Scanner;

public class Q1_1 {
    static void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of an array");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i <n ; i++) {
            arr[i] = arr[i-1]+arr[i];
        }
         printArray(arr);
    }
}
