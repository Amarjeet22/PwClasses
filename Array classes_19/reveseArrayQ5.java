package lactNo19Pw;
//rotate the given array a by k steps where k is non-negative
//note: k can be grater than n as well
import java.util.Scanner;

public class reveseArrayQ5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter "+ n +"element of an array");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k rev");
        int k = sc.nextInt();
        int temp =0;
        k=k%n;

        for (int i = n-k ,j=n-1 ; i <j ; i++ , j--) {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for (int i = 0,j=n-k-1; i <j ; i++,j--) {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for (int i = 0,j=n-1; i <j ; i++ ,j--) {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
