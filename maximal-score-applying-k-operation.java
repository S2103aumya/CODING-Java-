import java.util.*;
public class Main
{
    public static long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
            for(int m:nums){
                pq.add(m);
            }
            long score=0;
            while(k>0 && pq.size()>0){
                int m=pq.poll();
                score+=m;
                double temp=Math.ceil((double)m/3);
                pq.add((int)temp);
                // System.out.println("score: "+score+" "+"temp :"+temp);
                k--;
            } 
        return score;
    }

	public static void main(String[] args) {
	    int nums[]={1,10,3,3,3};
	    int k=3;
	    System.out.print(maxKelements(nums,k));
	}
}
