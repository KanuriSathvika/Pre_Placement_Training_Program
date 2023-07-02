/**
 💡 **Question 2**

 A peak element is an element that is strictly greater than its neighbors.

 Given a**0-indexed**integer array`nums`, find a peak element, and return its index. If the array contains
 multiple peaks, return the index to**any of the peaks**.

 You may imagine that`nums[-1] = nums[n] = -∞`. In other words, an element is always considered to
 be strictly greater than a neighbor that is outside the array.

 You must write an algorithm that runs in`O(log n)`time.

 **Example 1:**

 ```
 Input: nums = [1,2,3,1]
 Output: 2
 Explanation: 3 is a peak element and your function should return the index number 2.
 ```

 */

package Pre_Placement_Assignment.Assignment_11;

public class Sol_02 {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        int s=0,e=nums.length-1;
        if(nums.length==1){
            return 0;
        }
        if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        if(nums.length==2 && nums[nums.length-1]<nums[nums.length-2]){
            return nums.length-2;
        }

        for(int i=1;i<nums.length-1;i++){
            if(nums[i-1]<nums[i] && nums[i]>nums[i+1]){
                return i;
            }
        }

        return 0;
    }
}
