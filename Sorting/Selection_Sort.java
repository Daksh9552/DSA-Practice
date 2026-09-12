package Sorting;

public class Selection_Sort {
    public static void print (int [] arr){
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int [] arr ={ 1,3,8,5,9,0,7,4};
        print(arr);

        for (int i=arr.length-1; i>0; i-- ) {
            int n = Integer.MIN_VALUE, m = -1;

            for (int j=i; j >= 0; j--){
                if (arr [j] > n){
                    n=arr[j];
                    m=j;
                }

            }
            int temp = arr[i];
            arr [i] = arr [m];
            arr [m] = temp;

            print(arr);

        }
    }
}
