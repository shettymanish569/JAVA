import java.util.*;
/**
 * loop
 */
public class loop {

    public static void main(String[] args) {
        int i=0;
        while(true){
            if(i==2){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
            if(i>5){
                break;
            }
        }
    }
}
