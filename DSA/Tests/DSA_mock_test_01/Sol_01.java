/**
  **Question_01**
 * Move Zeroes
 Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 Note that you must do this in-place without making a copy of the array.

 Example 1:
 Input: nums = [0,1,0,3,12]
 Output: [1,3,12,0,0]

 Example 2:
 Input: nums = [0]
 Output: [0]

 Constraints:
 a. 1 <= nums.length <= 10^4
 b. -2^31 <= nums[i] <= 2^31 - 1
 */

package Pre_Placement_Assignment.Tests.DSA_mock_test_01;

import java.util.Arrays;

public class Sol_01 {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
    public static int[] moveZeroes(int[] nums) {
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[pos]=nums[i];
                pos+=1;
            }
        }
        for(int x=pos;x<nums.length;x++){
            nums[x]=0;
        }
     return nums;
    }
}
