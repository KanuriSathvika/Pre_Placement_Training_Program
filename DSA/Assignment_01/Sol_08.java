/**

 **Q8.** You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately,
 * due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition
 * of one number and loss of another number.

 You are given an integer array nums representing the data status of this set after the error.

 Find the number that occurs twice and the number that is missing and return them in the form of an array.

 **Example 1:**
 Input: nums = [1,2,2,4]
 Output: [2,3]


 */

package DSA.Assignment_01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sol_08 {
    public static void main(String[] args) {
        int[] nums={1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] result = new int[2];

        int sum = (n * (n + 1)) / 2;

        int arraySum = 0;
        for (int num : nums) {
            arraySum += num;
        }

        Set<Integer> set = new HashSet<>();
        int uniqueSum = 0;
        for (int num : nums) {
            if (!set.add(num)) {
                result[0] = num;  // Duplicate number
            }
            uniqueSum += num;
        }

        int missingNum = sum - (uniqueSum - result[0]);
        result[1] = missingNum;
        return result;
    }
}
