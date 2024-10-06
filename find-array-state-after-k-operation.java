import java.util.*;
public class Main
{
    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        int MOD=1000000007;
        PriorityQueue<long[]>pq=new PriorityQueue<>((a,b)->{
            if(a[0]==b[0]){
                return Long.compare(a[1], b[1]);
            }
            return Long.compare(a[0], b[0]);
        });
        for(int i=0;i<nums.length;i++){
            pq.add(new long[]{nums[i],i});
        }
        while(k-- >0){
            long ar[]=pq.poll();
            long a=ar[0];
            long b=ar[1];
            long newval=(a*multiplier)%MOD;
            nums[(int)b]=(int)(newval);
            pq.add(new long[]{newval,b});
        }
        return nums;
    }

	public static void main(String[] args) {
	    int nums[]={66307295,441787703,589039035,322281864};
	    int mul=641725;
	    int k=900900704;
	    int arr[]=getFinalState(nums,k,mul);
		System.out.println(arr);
	}
}
