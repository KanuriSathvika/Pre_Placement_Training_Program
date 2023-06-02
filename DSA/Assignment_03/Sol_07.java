/**
 You are given an inclusive range [lower, upper] and a sorted unique integer array
 nums, where all elements are within the inclusive range.
 A number x is considered missing if x is in the range [lower, upper] and x is not in
 nums.
 Return the shortest sorted list of ranges that exactly covers all the missing
 numbers. That is, no element of nums is included in any of the ranges, and each
 missing number is covered by one of the ranges.
 Example 1:
 Input: nums = [0,1,3,50,75], lower = 0, upper = 99
 Output: [[2,2],[4,49],[51,74],[76,99]]
 Explanation: The ranges are:
 [2,2]
 [4,49]
 [51,74]
 [76,99]
 */

package Pre_Placement_Assignment.Assignment_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol_07 {
    public static void main(String[] args) {
        int[] nums={0,1,3,50,75};
        int lower=0,upper=99;

        int[][] miss=findMissingRanges(nums,lower,upper);
        System.out.print("[");
        for (int i=0;i< miss.length;i++) {
            if(i==miss.length-1){
                System.out.print(Arrays.toString(miss[i]));
            }
            else {
                System.out.print(Arrays.toString(miss[i]) + ",");
            }
        }
        System.out.println("]");


    }
    public static  int[][] findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> miss = new ArrayList<>();
        int x=0;
        for (int i = 0; i < nums.length; i++) {
               if(nums[i]-lower>1){
                  miss.add(new ArrayList < Integer > ());
                   miss.get(x).add((lower+1));
                   miss.get(x).add(nums[i]-1);
                   x++;
               }
                if(i==nums.length-1 && upper-nums[i]>1){
                   miss.add(new ArrayList < Integer > ());
                   miss.get(x).add((nums[i]+1));
                   miss.get(x).add(upper);
               }
            lower=nums[i];

        }
        int[][] array = new int[miss.size()][];
        for (int i = 0; i < miss.size(); i++) {
            List<Integer> row = miss.get(i);
            array[i] = new int[row.size()];
            for (int j = 0; j < row.size(); j++) {
                array[i][j] = row.get(j);
            }
        }


        return array;
    }
}







