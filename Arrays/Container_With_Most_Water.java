package Arrays;
public class Container_With_Most_Water {
    public int maxArea(int[] height) {
        int mul;
        int ans=0;
        int n= height.length;


        int i=0, j=n-1;

        while (i<j){
            if (height[i] > height[j]){
                 mul = height[j]*(j-i);
                 j--;
            }
            else {
                mul = height[i]*(j-i);
                i++;
            }
            if (mul>ans) ans=mul;

        }
        return ans;
    }
}

