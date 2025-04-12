import java.util.*;
public class anagram{
public static boolean anagramChecker(String str1,String str2){
    char[] charArray1=str1.toCharArray();
    char[] charArray2=str2.toCharArray();

    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    return Arrays.equals(charArray1, charArray2);
}


public static void main(String [] args) {
String str1="listen";
String str2="silent";
if(anagramChecker(str1, str2)){
    System.out.println("True");
}else{
    System.out.println("False");
}
}
}