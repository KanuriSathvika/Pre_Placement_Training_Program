/**
 Given a non-empty array of integers nums, every element appears twice except
 for one. Find that single one.
 You must implement a solution with a linear runtime complexity and use only
 constant extra space.
 Example 1:
 Input: nums = [2,2,1]
 Output: 1
 */

package Pre_Placement_Assignment.Assignment_03;

public class Sol_06 {
    public static void main(String[] args) {
        int[] nums={2,2,1};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int xor=nums[0];
        for(int i=1;i<nums.length;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
}
