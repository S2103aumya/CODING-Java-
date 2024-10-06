import java.util.*;
public class Main
{
    public static int minimum(String a,String b){
        int dp[][]=new int[a.length()+1][b.length()+1];
        for(int i=1;i<=a.length();i++){
            for(int j=1;j<=b.length();j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                } else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int idx=dp[a.length()][b.length()];
        int count=0;
        int i=a.length();
        int j=b.length();
        while(i>0 && j>0){
            if(a.charAt(i-1)==b.charAt(j-1)){
                count++;
                i--;
                j--;
            } else if(dp[i-1][j]>dp[i][j-1]){
                i--;
            } else {
                j--;
            }
        }
        int ins=b.length()-count;
        int del=a.length()-count;
        return ins+del;
    }
	public static void main(String[] args) {
	    String a="heap";
	    String b="pea";
		System.out.println(minimum(a,b));
	}
}
