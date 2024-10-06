import java.util.*;
public class Main
{
    public static int peakIndexInMountainArray(int[] arr) {
        if(arr.length==1 || arr.length==2){
            return 0;
        }
        int l=0;
        int h=arr.length-1;
        int mid=0;
        while(l<=h){
            mid=(l+h)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            } else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                l=mid;
            } else {
                h=mid;
            }
        }
        return 0;
    }

	public static void main(String[] args) {
		int arr[]={0,2,1,0};
		System.out.print(peakIndexInMountainArray(arr));
	}
}
