/**
 You are given an integer array nums and an integer k.
 In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i]
 to nums[i] + x where x is an integer from the range [-k, k]. You can apply this operation at
 most once for each index i.
 The score of nums is the difference between the maximum and minimum elements in nums.
 Return the minimum score of nums after applying the mentioned operation at most once for
 each index in it.
 Example 1:
 Input: nums = [1], k = 0
 Output: 0
 Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0.

 */

package Pre_Placement_Assignment.Assignment_02;

import java.util.Arrays;

public class Sol_08 {
    public static void main(String[] args) {
        int[] nums={1};
        int k=0;
        System.out.println(smallestRangeI(nums,k));
    }
    public static int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        if((max-k)-(min+k)<=0){
            return 0;
        }
        return (max-k)-(min+k);
    }
}
