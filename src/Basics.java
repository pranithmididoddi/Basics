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
}
