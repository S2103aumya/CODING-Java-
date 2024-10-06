
import java.util.*;
public class Main {
    public static int findMin(int[] nums) {
        if(nums.length==2){
            return Math.min(nums[0],nums[1]);
        }
        if(nums.length==1){
            return nums[0];
        }
        int l=0;
        int h=nums.length-1;
        int mid=0;
        int ans=Integer.MAX_VALUE;
        while(l<=h){
            mid=(l+h)/2;
             if(nums[mid]>=nums[l]){
                ans=Math.min(ans,nums[l]);
                l=mid+1;
            } else {
                ans=Math.min(ans,nums[mid]);
                h=mid-1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int nums[] = {3,4,5,1,2};
        System.out.println(findMin(nums));
    }
}
