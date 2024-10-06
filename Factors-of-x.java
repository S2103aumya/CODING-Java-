import java.util.*;
public class Main
{
    public static ArrayList<Integer> factor(int n){
        int i=1;
        ArrayList<Integer>l=new ArrayList<>();
        while(i*i<=n){
            if(n%i==0){
                l.add(i);
                if(i!=n/i){
                    l.add(n/i);
                }
            }
            i++;
        }
        return l;
    }
	public static void main(String[] args) {
	    int n=54;
	    ArrayList<Integer>l=factor(n);
	    Collections.sort(l);
		System.out.println(l);
	}
}
