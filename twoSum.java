import java.util.*;
public class twoSum{
    public static String twoSUm(int arr[],int target,int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    return "YES";
                }
            } 
        }
        return "NO";
    }
    public static void main(String args[]){
        int n=5;
        int arr[]={2,6,5,8,11};
        int target=14;
        System.out.println("This is the answer "+twoSUm(arr, target, n));
    }
}