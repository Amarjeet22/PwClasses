package lactNo21Pw;
//array  of size n. Answer q queries where you need to print the sum of values in a given rang of Indices form l to r (both included)
import java.util.Scanner;

public class Q2 {
    static void print(int [] arr){
        int n = arr.length;
        for (int i = 1; i < arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array n = ");
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        System.out.println("Enter the element of an array "); // we are taking 1 based indexing
        for (int i = 1; i <=n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number of queries q ");
        int q= sc.nextInt();

        for (int i = 1; i <arr.length ; i++) {
            arr[i] = arr[i-1]+arr[i];
        }
        while (q-- >0){
            System.out.println("Enter range l and r");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = arr[r]-arr[l-1];

            System.out.println(ans);
        }

    }
}
