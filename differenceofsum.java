import java.util.*;
public class Main
{
    public static int sum(int m,int n){
        int sum=0;
        int nondiv=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                sum+=i;
            } else {
                nondiv+=i;
            }
        }
        return sum-nondiv;
    }
	public static void main(String[] args) {
	    int n=30;
	    int m=6;
		System.out.println(sum(m,n));
	}
}
