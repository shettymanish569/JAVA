import java.util.*;
public class remove_char{
    public static void main(String [] args){

        String s1="AABBCC";
        String s2="AA";
        StringBuilder result=new StringBuilder();
        for(char c: s1.toCharArray()){
            if(s2.indexOf(c)==-1){
                result.append(c);
            }
        }
        System.out.println(result.toString());
    }
}