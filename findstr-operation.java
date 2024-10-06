import java.util.*;
public class Main
{
    public static String findstr(String str){
        String arr[]=str.split("\\s+");
        int no1=Integer.parseInt(arr[0],2);
        int no2=Integer.parseInt(arr[1],2);
        String operation=arr[2];
        int res=0;
        if(operation.equals("AND")){
            res=no1 & no2;
        } else if(operation.equals("OR")){
            res=no1 | no2;
        } else {
            res=no1 ^ no2;
        }
        return Integer.toBinaryString(res);
    }
	public static void main(String[] args) {
		String str="1101 1011 OR";
		System.out.print(findstr(str));
	}
}
