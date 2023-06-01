/**
 We define a harmonious array as an array where the difference between its maximum value
 and its minimum value is exactly 1.
 Given an integer array nums, return the length of its longest harmonious subsequence
 among all its possible subsequences.
 A subsequence of an array is a sequence that can be derived from the array by deleting some
 or no elements without changing the order of the remaining elements.
 Example 1:
 Input: nums = [1,3,2,2,5,2,3,7]
 Output: 5
 */


package Pre_Placement_Assignment.Assignment_02;

import java.util.Arrays;

public class Sol_03 {
    public static void main(String[] args) {
        int[] nums={1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }
    public static int findLHS(int[] nums) {
        int maxi=0;
        int l=0,r=1;
        Arrays.sort(nums);
        while(r<nums.length){
            if(nums[r]-nums[l]==1){
                maxi=Math.max(maxi,(r-l)+1);
            }
            while(nums[r]-nums[l]>1){
                l++;
            }
            r++;
        }

        return maxi;
    }
}
