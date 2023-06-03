/**

 💡 **Question 6**
 Given an integer array nums sorted in **non-decreasing** order, return *an array of **the squares of each number** sorted in non-decreasing order*.

 **Example 1:**

 Input: nums = [-4,-1,0,3,10]

 Output: [0,1,9,16,100]

 */

package Pre_Placement_Assignment.Assignment_04;

import java.util.Arrays;

public class Sol_06 {
    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        System.out.println(Arrays.toString(nums));
    }
    public static int[] sortedSquares(int[] nums) {
        for(int x=0;x<nums.length;x++){
            nums[x]=nums[x]*nums[x];
        }
        Arrays.sort(nums);
        return nums;
    }
}
