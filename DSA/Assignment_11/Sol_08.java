/**
 💡 **Question 8**

 Given two integer arrays`nums1`and`nums2`, return*an array of their intersection*.
 Each element in the result must appear as many times as it shows in both arrays and you may
 return the result in**any order**.

 **Example 1:**
 Input: nums1 = [1,2,2,1], nums2 = [2,2]
 Output: [2,2]

 */

package Pre_Placement_Assignment.Assignment_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol_08 {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));

    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1=new ArrayList<>();
        for(int i:nums1){
            list1.add(i);
        }
        List<Integer> val=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(list1.contains(nums2[i])){
                val.add(nums2[i]);
                list1.remove(list1.indexOf(nums2[i]));
            }
        }
        int[] inter=new int[val.size()];
        for(int i=0;i<val.size();i++){
            inter[i]=val.get(i);
        }
        return inter;
    }
}
