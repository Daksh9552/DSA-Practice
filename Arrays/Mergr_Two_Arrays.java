package Arrays;

public class Mergr_Two_Arrays {
    static void main(String[] args) {
        int [] a = {1,4,6,8,9};
        int []b =  {2,3,5,7,8};
        int []c = new int[a.length-1 + b.length-1];
        merge(a,b,c);
        for(int ele: c){
            System.out.print(ele+" ");
        }
    }

    public static void merge(int []a, int[]b, int[]c){
        int i=0, j=0, k=0;
        while (i<a.length-1 && j<b.length-1){
            if(a[i]<b[j])c[k++]=a[i++];
            else c[k++]=b[j++];
        }
        while (i<a.length-1){
            c[k++]=a[i++];
        }
        while (j<b.length-1){
            c[k++]=b[j++];
        }
    }
}
