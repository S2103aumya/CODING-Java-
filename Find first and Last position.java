
import java.util.*;
public class Main {
    public static int[] searchRange(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        int mid=0;
        while(l<=h){
            mid=(l+h)/2;
            if(nums[mid]==target){
                if(mid==0 || mid==nums.length-1){
                    return new int[]{mid,mid};
                } else {
                    return new int[]{mid-1,mid};
                }
            } else if(nums[mid]<target){
                l=mid+1;
            } else {
                h=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String args[]){
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
}
