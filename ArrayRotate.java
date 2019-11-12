import java.util.Scanner;
public class ArrayRotate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.println("Enter " +n+" elements to insert: ");
        for(i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter distance : ");
        int d = sc.nextInt();
        int arr1[] = new int[d];
        for(i = 0; i < d; i++){
            arr1[i] = arr[i];
        }
        for(i = d; i < arr.length; i++){
            arr[i-d] = arr[i];
        }
        for(i = 0; i< arr1.length; i++){
            arr[arr.length - d + i] = arr1[i];
        }
        //Final rotated array is
        System.out.println("Rotated array:");
        for(i = 0; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
 	}
}

/*
input:
1 2 3 4 5
distance=2
output:
3 4 5 1 2
input2:
1 2 3 4 5 6
distance=4
output:
5 6 1 2 3 4
*/

