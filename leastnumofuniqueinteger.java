import java.util.*;
public class Main
{
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int m:arr){
            hm.put(m,hm.getOrDefault(m,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>>pq=new PriorityQueue<> ((a,b) ->{
            return a.getValue()-b.getValue();
        });
        
        pq.addAll(hm.entrySet());

        while (k > 0) {
            Map.Entry<Integer, Integer> entry = pq.poll();
            if (entry.getValue() > k) {
                return pq.size() + 1;
            } else {
                k -= entry.getValue();
            }
        }
        return pq.size();
    }

	public static void main(String[] args) {
		int nums[]={4,3,1,1,3,3,2};
		int k=3;
		System.out.print("\n"+findLeastNumOfUniqueInts(nums,k));
	}
}
