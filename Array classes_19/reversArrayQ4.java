package lactNo19Pw;
//in place revers

public class reversArrayQ4 {
    public static void main(String[] args) {
        int temp =0;
        int arr [] = {1,2,3,4,5,6};
        int n = arr.length;
        for (int i = 0 ,j=n-1 ; i < j; i++,j--) {
                temp = arr[i] ;
                arr[i]=arr[j];
                arr[j]=temp;
            }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
