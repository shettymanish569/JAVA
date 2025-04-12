//CASE 1
// arr1[i]==arr2[j] increment i

// CASE 2
// arr1[i]<arr2[j] increment i

//CASE 3
// arr1[i]>arr2[j] increment j




package Arrays;
import java.util.*;
public class union2 {
static ArrayList<Integer> findUnion(int arr1[],int arr2[],int n,int m){
    int i=0,j=0;
    ArrayList<Integer> union=new ArrayList<>();
    while(i<n && j<m){
        if(arr1[i]<=arr2[j]){
            if(union.size()==0|| union.get(union.size()-1)!=arr1[i])
            union.add(arr1[i]);
            i++;
        }else{
                if(union.size()==0|| union.get(union.size()-1)!=arr2[j])
                union.add(arr2[j]);
                j++;
            }
        }
        while(i<n){
            if( union.get(union.size()-1)!=arr1[i])
            union.add(arr1[i]);
            i++;
        }
        while(j<m){
            if( union.get(union.size()-1)!=arr2[j])
            union.add(arr2[j]);
            j++;
        }
        return union;
    }

public static void main(String[] args) {
    int arr1[]={1,2,3,4};
    int arr2[]={3,4,5,6,7,8};
    int m=6;
    int n=4;
    ArrayList<Integer> union=findUnion(arr1, arr2, n, m);
    System.out.println("The union of arr1 and arr2 are :"+union);
}
    
}