import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	    int n=obj.nextInt();
	    String arr[]=new String[n];
	    for(int i=0;i<n;i++){
	        arr[i]=obj.next();
	    }
	    int counta=0;
        int countb=0;
        String firststr=arr[0];
        String secstr="";
        for(int i=0;i<arr.length;i++){
            if(firststr.equals(arr[i])){
                counta++;
            } else{
                secstr=arr[i];
                countb++;
            }
        }
        if(counta>=countb){
            System.out.print("winning team is :"+firststr);
        } else {
            System.out.print("winning team is :"+secstr);
        }
	}
}
