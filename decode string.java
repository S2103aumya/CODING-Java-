import java.util.*;
public class Main
{
    public static String decode(String str){
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=1;i<str.length();i++){
            char ch=str.charAt(i);
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            } else {
                sb.append(str.charAt(i-1));
                sb.append(count);
                count=1;
            }
        }
        int n=str.length()-1;
        if(str.charAt(n-1)==str.charAt(n-2)){
            sb.append(str.charAt(n-1)).append(count);
        }
        return sb.toString();
    }
	public static void main(String[] args) {
	    String str="aabbbbeeeeffggg";
		System.out.println(decode(str));
	}
}
