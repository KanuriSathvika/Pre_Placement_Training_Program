/**
**Q7.** Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.

 Note that you must do this in-place without making a copy of the array.

 **Example 1:**
 Input: nums = [0,1,0,3,12]
 Output: [1,3,12,0,0]

 */


package DSA.Assignment_01;

import java.util.Arrays;

public class Sol_07 {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
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
        System.out.println(Arrays.toString(nums));
    }
}
