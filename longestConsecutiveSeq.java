import java.util.*;
public class longestConsecutiveSeq{
    public static int longestSeq(int[] a){
        int n=a.length;
        if(n==0){
            return 0;
        }
        int longest=1;

        Set<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(a[i]);
        }
        for (int it : s) {
            if(!s.contains(it-1)){
                int cnt=1;
                int x=it;

                while (s.contains(x+1)) {
                    cnt++;
                    x++;
                }
                longest=Math.max(cnt, longest);
            }
        }
        return longest;
        

    }
    public static void main(String[] args) {
        int[] a={100,200,1,2,3,4};
        int n=a.length;
        for(int i=0;i<n;i++){
            System.out.println(longestSeq(a));
        }
    }
}