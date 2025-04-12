import java.util.*;
public class island_sweet{
    public static int minBoxes(int n,int d ,int e){
        int totalSweetsNeeded=e*d;

        int totalSunday=d/7;

        int availablePurchaseDay=d-totalSunday;

        if(availablePurchaseDay*n<totalSweetsNeeded){
            return -1;
        }

        int totalBox=(totalSweetsNeeded+n-1)/n;
        return totalBox;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();

        System.out.println(minBoxes(n, d, e));
    }
}