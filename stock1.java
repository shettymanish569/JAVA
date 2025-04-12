import java.util.*;
public class stock1 {
    public static int profit(int arr[]){
        int maxProfit=0;
        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            int curProfit=arr[i]-min;
            maxProfit=Math.max(maxProfit, curProfit);
            min=Math.min(min, arr[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println("The profit is : "+profit(arr));
    }
}
