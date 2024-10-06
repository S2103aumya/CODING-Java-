import java.util.*;
public class Main
{
    public static int maxOccured(int L[], int R[], int n, int maxx){
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=L[i];j<=R[i];j++){
                hm.put(j,hm.getOrDefault(j,0)+1);
            }
        }
        int ans=Integer.MAX_VALUE;
        int val=0;
        for(int m:hm.keySet()){
            // System.out.print(m+" : "+hm.get(m)+" , ");
            if(val<=hm.get(m)){
                val=hm.get(m);
            }
        }
        for(int m:hm.keySet()){
            if(hm.get(m)==val){
                ans=Math.min(ans,m);
            }
        }
        return ans;
        
    }
	public static void main(String[] args) {
        int n = 4;
        int L[] = {1,4,3,1};
        int R[] = {15,8,5,4};
        int maxx=15;
		System.out.println("\n"+maxOccured(L,R,n,maxx));
	}
}
