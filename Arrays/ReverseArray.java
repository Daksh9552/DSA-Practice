package Arrays;

public class ReverseArray {
    static void main(String[] args) {

        int [] arr = {2,3,4,5,6,7,8};
        int i=0;
        int j= (arr.length) - 1;
        int temp;

        while(i<j){
            temp = arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int a=0; a< arr.length; a++ ){
            System.out.print(arr[a] +" ");
        }
    }
}


