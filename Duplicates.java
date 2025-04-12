// USING ARRAY 
//TIME COMPLEXITY  O(n*n)
// import java.util.*;
// class Duplicates{
//     public  boolean findDuplicattes(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         Duplicates db=new Duplicates();
//         int arr[]={1,2,3,1};
//         boolean res=db.findDuplicattes(arr);
//         System.out.println(res);
//     }
// }

// USING SORTING TECHNIQUE
// TIME COMPLEXITY O(N*LOGN)
// import java.util.*;
// public class Duplicates {
//     public static boolean findDuplicates(int arr[]){
//         Arrays.sort(arr);
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==arr[i=1]){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         Duplicates db=new Duplicates();
//         int arr[]={1,2,3};
//         boolean res=db.findDuplicates(arr);
//         System.out.println(res);
//     }
// }

//USING HASHSET
// TIME COMPLEXITY O(N)

import java.util.*;
/**
 * Duplicates
 */
public class Duplicates {
    public static boolean findDuplicate(int arr[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        if(set.size()<arr.length){
            return true;
        }
        return false;
    }
public static void main(String[] args) {
    Duplicates db=new Duplicates();
        int arr[]={1,2,3};
        boolean res=db.findDuplicate(arr);
        System.out.println(res);
}
}