import java.util.*;
public class Main{
    public static int findpeople(String str){
        int ans=0;
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='$' || ch=='@'){
                count=0;
            } else {
                count++;
                ans=Math.max(count+1,ans);
            }
        }
        return ans;
    }
    public static void main(String args[]){
        String str="PPPPPP@PPP@PP$PP";
        System.out.println(findpeople(str));
    }
}