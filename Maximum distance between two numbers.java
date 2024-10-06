
import java.util.*;
public class Main
{
    public static int maxDistance(int[] nums1, int[] nums2) {
        int ans=0;
        int idx=0;
        for(int i=0;i<nums1.length;i++){
            if(i>idx){
                idx=i;
            }
            while(idx<nums2.length && nums1[i]<=nums2[idx]){
                ans=Math.max(ans,idx-i);
                idx++;
            }
        }
        return ans;
    }

	public static void main(String[] args) {
		int nums1[] = {55,30,5,4,2};
		int nums2[] = {100,20,10,10,5};
		System.out.print(maxDistance( nums1, nums2));
		
	}
}
