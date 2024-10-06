import java.util.*;
public class Main
{
    public static int findidx(int nums[],int divisor,int quotient,int remainder){
        int divident=divisor*quotient+remainder;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==divident){
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	    int nums[]={12,24,2,21};
	    int divisor=8;
	    int quotient=3;
	    int remainder=0;
		System.out.println(findidx(nums,divisor,quotient,remainder));
	}
}
