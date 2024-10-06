import java.util.*;
public class Main
{
    public static int diff(int n,int k){
        int count=0;
        while(n>0 || k>0){
            System.out.println((n&1)+" "+(k&1));
            if((n & 1) != (k & 1)){
                count++;
            }
            n=n>>1;
            k=k>>1;
        }
        return count==0 ? -1 : count;
    }
	public static void main(String[] args) {
	    int n=13;
	    int k=14;
		System.out.println(diff(n,k));
	}
}
