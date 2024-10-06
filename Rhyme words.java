import java.util.*;
public class Main
{
    public static int rhyme(String word,String arr[]){
        int len=0;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(word))       continue;
            int idx=word.length()-1;
            int j=arr[i].length()-1;
            while(idx>=0 && j>=0){
                if(word.charAt(idx)==arr[i].charAt(j)){
                    idx--;
                    j--;
                } else{
                    break;
                }
            }
            if(arr[i].length()-j > len){
                len=Math.max(len,arr[i].length()-j);
                index=i;
            }
        }
        return index+1;
    }
	public static void main(String[] args) {
	    String word="thunder";
	    String arr[]={"puzzle","thunder","powder","blender","under"};
		System.out.println(rhyme(word,arr));
	}
}
