import java.util.*;
public class superior {
   public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] arr= new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int count=0;
    int sup=Integer.MIN_VALUE;
    for(int i=n-1;i>=0;i--){
        if(arr[i]>sup){
            count++;
            sup=arr[i];
        }
    }
System.err.println(count);
   } 
}
