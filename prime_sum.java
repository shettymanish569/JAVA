import java.util.*;
public class prime_sum{
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static int sumOfPrime(int num){
        int sum=0;
        for(int i=2;i<=num;i++){

            if(isPrime(i)){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=10;
        System.out.println(sumOfPrime(num));
    }
}