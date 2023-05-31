/**

  **Q6.** Given an integer array nums, return true if any value appears at least twice in the array, and return
 * false if every element is distinct.

 **Example 1:**
 Input: nums = [1,2,3,1]

 Output: true

 */

package DSA.Assignment_01;

import java.util.Arrays;

public class Sol_06 {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int j=1;j<nums.length;j++){
            if(nums[j-1]==nums[j]){
                return true;
            }
        }
        return false;
    }
}
