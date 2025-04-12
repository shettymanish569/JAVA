package Arrays;
import java.util.*;
/**
 * 2ndlargest
 */
public class secondlargestSmallest {
    public static int secSmallest(int n,int arr[]){
        if(n<2){
            return -1;
        }
       int small=Integer.MAX_VALUE;
       int sec_small=Integer.MAX_VALUE;

       for(int i=0;i<n;i++){
        if(arr[i]<small){
            sec_small=small;
            small=arr[i];
        }else if(arr[i]<sec_small && arr[i]!=small){
            sec_small=arr[i];
        }
       }
       return sec_small;
    }
    public static int secLargest(int n,int arr[]){
        if(n<2){
            return -1;
        }
       int large=Integer.MIN_VALUE;
       int sec_large=Integer.MIN_VALUE;

       for(int i=0;i<n;i++){
        if(arr[i]>large){
            sec_large=large;
            large=arr[i];
        }else if(arr[i]>sec_large && arr[i]!=large){
            sec_large=arr[i];
        }
       }
       return sec_large;
    }
    public static void main(String args[]){
        int arr[]={2,4,5,7,9,10};
        int n=arr.length;
        System.out.println("The 2nd Largest number is "+secLargest(n, arr));
        System.out.println("The 2nd Smallest number is "+secSmallest(n, arr));
    }
}