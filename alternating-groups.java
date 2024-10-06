import java.util.*;
public class Main
{
        public static int numberOfAlternatingGroups(int[] colors) {
        int count=0;
        for(int i=0;i<colors.length-2;i++){
            if(colors[i]==colors[i+2] && colors[i]!=colors[i+1]){
                count++;
            }
        }
        int n=colors.length;
        if((colors[n-1]==colors[1] && colors[n-1]!=colors[0])){
            count++;
        }
        if((colors[n-2]==colors[0] && colors[n-2]!=colors[n-1])){
            count++;
        }
           return count;
    }
	public static void main(String[] args) {
	    int arr[]= {0,1,0};
		System.out.println(numberOfAlternatingGroups(arr));
	}
}
