package Sorting;

public class BubbleSort {
    public static void print (int [] arr){
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int [] arr = {5,1,2,3,4,5,6};
        print (arr);
        for (int i=0; i<arr.length-1; i++){
            boolean flag = true;
            for (int k=0; k<arr.length-1; k++){
                if (arr[k] > arr[k+1]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) break;
            for (int j=0; j<arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            print(arr);
        }

    }
}
