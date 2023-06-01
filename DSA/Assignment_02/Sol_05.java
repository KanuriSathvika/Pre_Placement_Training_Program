/**
 Given an integer array nums, find three numbers whose product is maximum and return the
 maximum product.
 Example 1:
 Input: nums = [1,2,3]
 Output: 6
 */

package Pre_Placement_Assignment.Assignment_02;

import java.util.Arrays;

public class Sol_05 {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(maximumProduct(nums));
    }
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int first=nums[0]*nums[1]*nums[nums.length-1];
        int last=nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];
        if(first<last){
            return last;
        }
        return first;

    }
}
