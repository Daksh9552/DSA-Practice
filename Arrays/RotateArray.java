package Arrays;

import java.util.Scanner;

public class RotateArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {2,5,7,4,5,8,9,10};
        System.out.println("Enter index");
        int d =sc.nextInt();
        int n= arr.length-1;
        d=d%n;
        rotate(arr,0,d-1);
        rotate(arr, d,n);
        rotate(arr, 0, n);

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    public static void rotate(int[]arr, int i, int j){
        int temp;
        while (i<j){
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
