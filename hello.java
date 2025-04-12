import java.util.*;
public class hello {
    public static void main(String[] args) {
        // //for making constant value we will write final before any data type

        // final float PI=3.14F;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int num1=sc.nextInt();
     
        System.out.print("Enter the number2: ");
        int num2=sc.nextInt();
        
       if(num1>=0 || num2>=50){
        System.out.println("true");
       }
    }
}
