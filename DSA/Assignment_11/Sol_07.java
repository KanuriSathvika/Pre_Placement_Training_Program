/**
 Given an array of integers nums sorted in non-decreasing order, find the starting and ending position
 of a given target value.

 If target is not found in the array, return [-1, -1].

 You must write an algorithm with O(log n) runtime complexity.

 Example 1:

 Input: nums = [5,7,7,8,8,10], target = 8
 Output: [3,4]
 */

package Pre_Placement_Assignment.Assignment_11;

import java.util.Arrays;

public class Sol_07 {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        System.out.println(Arrays.toString(searchRange(nums,target)));

    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ind={-1,-1};
        int i=0,j=nums.length-1;
        while(i<=j){
            if(nums[i]==target && nums[j]==target){
                ind[0]=i;
                ind[1]=j;
                return ind;
            }
            if(nums[i]!=target){
                i++;
            }
            if(nums[j]!=target){
                j--;
            }
        }
        return ind;
    }
}
