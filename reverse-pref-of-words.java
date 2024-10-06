import java.util.*;
public class Main
{
    public static String reversePrefix(String word, char ch) {
        int idx=word.indexOf(String.valueOf(ch));
        System.out.print(idx);
        if(idx==-1){
            return word;
        }
        String pref=word.substring(0,idx+1);
        System.out.println(pref);
        String res=reverse(pref)+word.substring(idx+1);
        return res;
    }
    public static String reverse(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

	public static void main(String[] args) {
		String str="abcdefg";
		char ch='d';
		System.out.print(reversePrefix(str,ch));
	}
}
