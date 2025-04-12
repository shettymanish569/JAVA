//USING ARRAYLIST

import java.util.*;
public class stock2 {
    public static int stockFind(ArrayList<Integer> prices){
        int maxProfit=0;
        int mini=prices.get(0);
        for(int i=0;i<prices.size();i++){
            int curProfit=prices.get(i)-mini;
            maxProfit=Math.max(maxProfit, curProfit);
            mini=Math.min(mini, prices.get(i));
        }
        return maxProfit;
    } 
    public static void main(String args[]){
        ArrayList<Integer> prices=new ArrayList<>();
        prices.add(2);
        prices.add(7);
        prices.add(1);
        prices.add(5);
        prices.add(3);
        prices.add(6);
        prices.add(4);
        Object stock2=stockFind(prices);
        System.out.println(stock2);
        
    }
}
