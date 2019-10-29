public class Leaders {
    public static void main(String args[]){
        int arr[] = {14, 6 , 9, 3, 2, 4, 1};
        int n = arr.length - 1;
        int max = arr[n];
        System.out.print(max+" ");
        for (int i = n - 1; i >=0 ; i--){
            // System.out.println("->"+arr[i]);
            if(arr[i] > max){
                max = arr[i];
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}