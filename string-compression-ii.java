import java.util.*;
public class Main
{
    public static String compressedString(String word) {
        StringBuilder sb=new StringBuilder();
        int n=word.length();
        if(word.length()<2){
            return "1"+word.charAt(n-1);
        }
        int count=1;
        int idx2=0;
        for(int i=0;i<word.length()-1;i++){
            count=1;
            int idx1=0;
            idx2=0;
            if(idx1<word.length() &&  idx2<word.length()) {
                idx1=i; idx2=i+1;
                while(idx2<word.length() && word.charAt(idx1) == word.charAt(idx2) && count<9){
                    count++;
                    idx1++;
                    idx2++;
                }
                i=idx1;
                System.out.println(count+" "+word.charAt(idx1)+" "+idx1+" "+idx2);
                 if (count > 0) {
                    sb.append(count);
                    sb.append(word.charAt(i));
                    count=1;
                }
            }
        }
        if (count > 0 && idx2!=word.length()) {
                    sb.append(count);
                    sb.append(word.charAt(n-1));
                }
        
        return sb.toString();
    }

	public static void main(String[] args) {
	    String word = "cccccccccc";
		System.out.println(compressedString(word));
	}
}
