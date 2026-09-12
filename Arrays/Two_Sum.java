package Arrays;

import java.util.Scanner;

public class Two_Sum {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length = ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){

                if (i != j && arr[i]+ arr[j] == 2){
                    System.out.println(arr[i] + " , " + arr[j]);
                }
            }
        }
    }
}
