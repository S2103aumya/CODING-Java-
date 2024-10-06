import java.util.*;
public class Main
{
    public static int findMaxLength(int[] nums) {
        int count=0;
        int ans=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++){
            count+=nums[i]==0?-1:1;
            if(hm.containsKey(count)){
                ans=Math.max(ans,i-hm.get(count));
            } else {
                hm.put(count,i);
            }
        }
        return ans;
    }

	public static void main(String[] args) {
	    int nums[] = {0,1,0};
		System.out.println(findMaxLength(nums));
	}
}
