package Arrays;

import java.util.Scanner;

public class Sum_of_Elements {
    static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum=0;
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
