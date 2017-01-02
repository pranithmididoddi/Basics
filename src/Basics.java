import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Pranith on 12/28/16.
 */

public class Basics{

    public static void main(String[] args){
        int[] arr={3,30,34,5,9};
        System.out.println(largestNumber(arr));
    }

    public static String largestNumber(int[] nums){
        String[] arr=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        StringBuilder sb=new StringBuilder();
        for (String s : arr){
            sb.append(s);
        }


        while(sb.charAt(0)=='0'&&sb.length()>1)
            sb.deleteCharAt(0);

        return sb.toString();
    }
}