/**
 💡 **Question 4**

 Given an array of integers`nums`containing`n + 1`integers where each integer is in the range`[1, n]`inclusive.

 There is only**one repeated number**in`nums`, return*thisrepeatednumber*.

 You must solve the problem**without**\modifying the array`nums`and uses only constant extra space.
 Input: nums = [1,3,4,2,2]
 Output: 2

 */

package Pre_Placement_Assignment.Assignment_11;

import java.util.Arrays;

public class Sol_04 {
    public static void main(String[] args) {
        int[] nums={1,3,4,2,2};
        System.out.println(findDuplicate(nums));

    }
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return nums.length ;
    }
}
