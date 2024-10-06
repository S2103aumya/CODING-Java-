
import java.util.*;
public class Main
{
    public static boolean judgeSquareSum(int c) {
        long i=0;
        long j=(long)Math.sqrt(c);
        while(i<=j){
            long num=i*i+j*j;
            if(num>c){
                j--;
            } else if(num<c){
                i++;
            } else {
                return true;
            }
        }
        return false;
    }

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int c=obj.nextInt();
		System.out.print(judgeSquareSum(c));
	}
}
