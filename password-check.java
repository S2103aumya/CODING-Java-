import java.util.*;
public class Main
{
    public static boolean password(String str){
        int countalpha=0;
        int countdigit=0;
        int capch=0;
        if(Character.isDigit(str.charAt(0))){
            return false;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)) {
                countdigit++;
            } else if(ch>='a' && ch<='z'){
                countalpha++;
            } else if(ch>='A' && ch<='Z'){
                capch++;
            } else if(ch=='/' && ch== ' '){
                return false;
            }
        }
        System.out.print(countalpha+" "+countdigit+" "+capch);
        return countalpha>=0 && countdigit>=0 && capch>=0;
        
    }
	public static void main(String[] args) {
		String str="aA1_67";
		System.out.print(password(str));
	}
}
