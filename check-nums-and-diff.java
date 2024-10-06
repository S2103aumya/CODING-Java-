import java.util.*;
public class Main
{
    public static int calculate(int nums[],int num,int diff){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(Math.abs(num-nums[i])<=diff){
                count++;
            }
        }
        return count;
    }
	public static void main(String[] args) {
	    int nums[]= {12, 3, 14, 56, 77, 13};
	    int num=13;
	    int diff=2;
		System.out.println(calculate(nums,num,diff));
	}
}
