import java.util.*;

public class project {
    public static void main(String[] args) {
        int myNum=(int)(Math.random()*100);
        Scanner sc=new Scanner(System.in);
        int userNum=0;
        do{
            System.out.println("guess the number");
             userNum=sc.nextInt();
            if(userNum==myNum){
                System.out.println("Correct Answer");
                break;
            }else if(userNum>myNum){
                System.out.println("Oops reater than my number");
            }else{
                System.out.println("Oops less than my number");
            }
        }while(userNum>=0);
        System.out.println("my number was:" );
        System.out.println(myNum);
    }
}
