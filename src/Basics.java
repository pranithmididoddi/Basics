import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Pranith on 12/28/16.
 */
import java.util.*;

public class Basics{

    public static void main(String[] args){
        int[] arr={3,30,34,5,9};
        int[] arr2={-1,0,1,2,-1,-4};
        System.out.println(threesum(arr2));
        System.out.println(largestNumber(arr));
    }

    /**LeetCode largest number*/
    public static String largestNumber(int[] nums){
        String[] res=new String[nums.length];
        StringBuffer str=new StringBuffer();

        for(int i=0;i<nums.length;i++){
            res[i]=String.valueOf(nums[i]);
        }

        Arrays.sort(res, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        for(String o : res){
         str.append(o);
        }

        while(str.charAt(0)=='0'&&str.length()>1)
        str.deleteCharAt(0);

    return str.toString();
    }

    /**Find the sum of 3 numbers*/
    public static Set<List<Integer>> threesum(int[] nums){
        Set<List<Integer>> myset=new HashSet<>();

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;

            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];

                if(sum==0){
                    myset.add(Arrays.asList(nums[i],nums[j],nums[k]));
                }

                if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return myset;
    }



}