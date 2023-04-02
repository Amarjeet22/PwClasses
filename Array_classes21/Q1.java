package lactNo21Pw;
// given a array return prifix sum make another array and store the valu of prifix
import java.util.Scanner;

public class Q1 {
    static void printarray(int arr[]){
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    static int[] prefixSum(int arr[]){
        int n = arr.length;
        int pref [] = new int[n]; // making a new array
            pref[0] = arr[0];
        for (int i = 1; i <n ; i++) {
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter element of an array");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
       int pref [] = prefixSum(arr);
        printarray(pref);

    }
}
