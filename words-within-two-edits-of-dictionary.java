import java.util.*;
public class Main
{
    public static List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String>l=new ArrayList<>();
        for(String word:queries){
            int count=matches(word,dictionary);
            System.out.println("word: "+word+" "+"count :"+count);
            if(count<=2){
                l.add(word);
            }
        }
        return l;
    }
    public static int matches(String word,String dictionary[]){
        for(String w:dictionary){
            int count=0;
            for(int i=0;i<w.length();i++){
                if(w.charAt(i)!=word.charAt(i)){
                    count++;
                }
            }
            if(count<=2){
                return count;
            }
        }
        return Integer.MAX_VALUE;
    }
	public static void main(String[] args) {
		String queries[] = {"word","note","ants","wood"};
		String dictionary[] = {"wood","joke","moat"};
		List<String>l=twoEditWords(queries,dictionary);
		System.out.print(l);
	}
}
