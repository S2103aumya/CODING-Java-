import java.util.*;
public class Main
{
    public static int countDistinctIntegers(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
            int m=reverse(nums[i]);
            System.out.print(m+" ");
            hs.add(m);
        }
        return hs.size();
    }
    public static int reverse(int num){
        int sum=0;
        while(num>0){
            int temp=num%10;
            sum=sum*10+temp;
            num=num/10;
        }
        return sum;
    }
	public static void main(String[] args) {
		int nums[]={1,13,10,12,31};
		System.out.print(countDistinctIntegers(nums));
	}
}
