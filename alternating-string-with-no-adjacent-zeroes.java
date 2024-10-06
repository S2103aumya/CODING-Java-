import java.util.*;
public class Main
{
    public static List<String> validStrings(int n) {
        int no=(int)Math.pow(2,n);
        List<String>l=new ArrayList<>();
        for(int i=0;i<no;i++){
            String m=convert(i,n);
            if(valid(m)){
                l.add(m);
            }
        }
        return l;
    }
    public static  String convert(int i,int n){
        StringBuilder sb=new StringBuilder();
        while(i>0){
            int temp=i%2;
            sb.append(temp);
            i=i/2;
        }
        while(sb.length()<n){
            sb.append(0);
        }
        return sb.reverse().toString();
    }
    public static  boolean valid(String no){
        for(int i=0;i<no.length()-1;i++){
            if(no.charAt(i)==no.charAt(i+1) && no.charAt(i)=='0'){
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
	    int k=3;
	    List<String>l=validStrings(k);
		System.out.println(l);
	}
}
