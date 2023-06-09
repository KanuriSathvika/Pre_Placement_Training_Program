/**
 **Q1.** Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.

        **Example:**
        Input: nums = [2,7,11,15], target = 9
        Output0 [0,1]
*/

package DSA.Assignment_01;

import java.util.Arrays;

public class Sol_01 {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ind=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ind[0]=i;ind[1]=j;
                    return ind;
                    // break;
                }
            }
        }
        return ind;
    }
}
