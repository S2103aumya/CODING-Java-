import java.util.*;
public class Main
{
    public static int wateringPlants(int[] plants, int capacity) {
        int countstep=0;
        int oricap=capacity;
        for(int i=0;i<plants.length;i++){
            if(plants[i]<=capacity){
                countstep+=1;
                capacity-=plants[i];
            } else {
                capacity=oricap;
                countstep+=i;
                countstep+=i+1;
                capacity-=plants[i];
            }
            System.out.print(capacity+" ");
        }
        return countstep;
    }

	public static void main(String[] args) {
		int plants[] = {2,2,3,3};
		int capacity=5;
		System.out.print("\n"+wateringPlants(plants,capacity));
	}
}
