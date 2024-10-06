import java.util.*;
public class Main
{
    public static boolean prime(int no){
        int sum=calculate(no);
        if(sum==2 || sum==3){
            return true;
        }
        if(sum%2==0 || sum%3==0){
            return false;
        }
        for(int i=5;i*i<=sum;i++){
            if(sum%i==0 || (sum%(i+2)==0)){
                return false;
            }
        }
        return true;
    }
    private static int calculate(int no){
        int sum=0;
        while(no>0){
            int temp=no%10;
            sum+=temp;
            no=no/10;
        }
        return sum;
    }
	public static void main(String[] args) {
	    int no=47;
		System.out.println(prime(no));
	}
}
