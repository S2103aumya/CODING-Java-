import java.util.*;
public class Main
{
    public static int counthours(int nums[]){
        int n=nums.length;
        int mod=1000000007;
        HashMap<Integer,Integer>hm=new HashMap<>();
        long count=0;
        for(int i=0;i<nums.length;i++){
            int rem=nums[i]%60;
            int target=60-rem;
            if(hm.containsKey(target)){
                count+=hm.get(target);
            }
            if(rem != 0) {
                    hm.put(rem, hm.getOrDefault(rem, 0) + 1);
            }    else {
                    hm.put(60, hm.getOrDefault(60, 0) + 1);
            }
        }
        return (int)count;
    }
	public static void main(String[] args) {
	    int nums[]={1,59,30,30};
		System.out.println(counthours(nums));
	}
}
