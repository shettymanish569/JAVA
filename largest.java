package Arrays;

import java.util.*;
public class largest{

    public static int maxNuber(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,1};

        System.out.println("The largest number is "+maxNuber(arr));
    }
}