package lactNo20Pw;

import java.util.Scanner;
// by pointer method without making a new array
public class Q1_1 {
    static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swip(int arr[] , int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static  void sortZeroOne(int[] arr){
        int n = arr.length;
        int left =0 , right =n-1;
        while (left<right){
        if(arr[left]==1 && arr[right]==0){
            swip(arr , left,right);
            left++;
            right--;
        }
        if(arr[left]==0){
            left++;
        }
        if(arr[right]==1){
            right--;
        }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter " +n+ " element of an array put only 1s and 0s");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();

        }
        sortZeroOne(arr);
        System.out.println("Sorted array: ");
        printArray(arr);


    }
}
