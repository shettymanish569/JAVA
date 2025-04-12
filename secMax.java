import java.util.*;
public class secMax {
    public static int secondSmallest(int arr[],int n){
        if(n<2){
            return -1;
        }
        int small=Integer.MAX_VALUE;
        int sec_small=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]< small){
                sec_small=small;
                small=arr[i];
            }else if(arr[i]<sec_small && arr[i]!=small){
                sec_small=arr[i];
            }
        }
        return sec_small;
        
    }


    public static int secondLargest(int arr[],int n){
        if(n<2){
            return -1;
        }
        int large=Integer.MIN_VALUE;
        int sec_large=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]> large){
                sec_large=large;
                large=arr[i];
            }else if(arr[i]>sec_large && arr[i]!=large){
                sec_large=arr[i];
            }
        }
        return sec_large;
        
    }
    public static void main(String[] args) {
        int arr[]={3,2,65,23,11,9,12,4};
        int n=arr.length;
        System.out.println("The second smallest number in the array is "+secondSmallest(arr, n));
        System.out.println("The second largest number in the array is "+secondLargest(arr, n));
    }
}
