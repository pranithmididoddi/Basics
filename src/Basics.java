/**
 * Created by Pranith on 12/28/16.
 */

/**Prime sum.*/
import java.util.*;
public class Basics {

    public static void main(String[] args){
        int num=7;

        System.out.println(primesum(num));
    }

    public static ArrayList<Integer> primesum(int a){

    ArrayList<Integer> myarray=new ArrayList<>();


        for(int i=2;i<a;i++){
        if(isPrime(i) && isPrime(a-i)){
            myarray.add(i);
            myarray.add(a-i);

            return myarray;
        }
    }
        return myarray;
}

    public static boolean isPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0) return false;
        }

        return true;
    }
/**Palindrome check*/
    public boolean isPalindrome(int a) {

        int temp=a;
        int remainder=0;
        int sum=0;

        while(temp>0){
            remainder=temp%10;
            sum=sum*10+remainder;
            temp=temp/10;
        }

        if(sum==a) return true;

        return false;
    }
}
