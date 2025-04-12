import java.util.*;
/**
 * sort
 */
public class sort {
public static boolean isSorted(int arr[]){
    for(int i=1;i<arr.length;i++){
       if(i==0){
        return false;
       }
        
        if (arr[i]<arr[i-1]) {
            return false;
        }
    }
    return true;
}
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){

            int arr[]= new int[i];
            System.out.println("Array5");
            System.out.println(isSorted(arr));
        }

    }
}