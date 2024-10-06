import java.util.*;
public class Main
{
    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            sb.append(words[i]);
        }
        System.out.println(s);
        String d=sb.substring(0,s.length());
        System.out.println(d);
        return sb.toString().equals(d);
    }
	public static void main(String[] args) {
	    String s = "iloveleetcode";
	    String words[] = {"i","love","leetcode","apples"};
		System.out.println(isPrefixString(s,words));
	}
}
