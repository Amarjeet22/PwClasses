package lactNo20Pw;

import java.util.Scanner;

//with pointer method
public class Q2_2 {
    static void printArray(int[]arr){
        int n = arr.length;
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
static void swip(int[] arr ,int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
}

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" element of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int left = 0 , right= n-1;
        while (left<right){
            if(arr[left]%2!=0 &&arr[right]%2==0){
                swip(arr , left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
                right--;
            }
        }
        printArray(arr);

    }
}
