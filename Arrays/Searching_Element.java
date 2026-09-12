package Arrays;

import java.util.Scanner;

public class Searching_Element {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("length = ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter array");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to find");
        int num = sc.nextInt();
        int a =arr[0];
        for (int i=0; i<n; i++){
            if (arr[i] == num) a=num;
        }
        if (a==num) System.out.println(num +" is present in array");
        else System.out.println(num +" is not present in array");
    }
}
