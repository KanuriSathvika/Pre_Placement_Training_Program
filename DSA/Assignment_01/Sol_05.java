/**
 💡 **Q5.** You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 representing the number of elements in nums1 and nums2 respectively.

 Merge nums1 and nums2 into a single array sorted in non-decreasing order.

 The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be
 merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 **Example 1:**
 Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 Output: [1,2,2,3,5,6]
 */

package DSA.Assignment_01;

import java.util.Arrays;

public class Sol_05 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;

        for (int x = 0; x < n; x++) {
            nums1[m + x] = nums2[x];
        }
        int temp;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 1; j < nums1.length - i; j++) {
                if (nums1[j] < nums1[j - 1]) {
                    temp = nums1[j];
                    nums1[j] = nums1[j - 1];
                    nums1[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
