/**
 **Question 2**

 Given two **0-indexed** integer arrays nums1 and nums2, return *a list* answer *of size* 2 *where:*

 - answer[0] *is a list of all **distinct** integers in* nums1 *which are **not** present in* nums2*.*
 - answer[1] *is a list of all **distinct** integers in* nums2 *which are **not** present in* nums1.

 **Note** that the integers in the lists may be returned in **any** order.

 **Example 1:**

 **Input:** nums1 = [1,2,3], nums2 = [2,4,6]

 **Output:** [[1,3],[4,6]]

 **Explanation:**

 For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2.
 Therefore, answer[0] = [1,3].

 For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2.
 Therefore, answer[1] = [4,6].
 */


package Pre_Placement_Assignment.Assignment_04;

import java.util.*;

public class Sol_02 {
    public static void main(String[] args) {
        int[] nums1={1,2,3};
        int[] nums2={2,4,6};
        System.out.println(findDifference(nums1,nums2));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> val=new ArrayList<>();
        Integer[] n1=new Integer[nums1.length];
        for(int i=0;i<nums1.length;i++){
            n1[i]=nums1[i];
        }
        Integer[] n2=new Integer[nums2.length];
        for(int i=0;i<nums2.length;i++){
            n2[i]=nums2[i];
        }
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(n1));
        Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(n2));
        Integer[] arr1 = set1.toArray( new Integer[set1.size()] );
        Integer[] arr2 = set2.toArray( new Integer[set2.size()] );

        set1.retainAll(set2);

        val.add(new ArrayList<Integer>());
        for(int i=0;i<arr1.length;i++){
            if(!set1.contains(arr1[i])){
                val.get(0).add(arr1[i]);
            }
        }
        val.add(new ArrayList<Integer>());
        for(int i=0;i<arr2.length;i++){
            if(!set1.contains(arr2[i])){
                val.get(1).add(arr2[i]);
            }
        }

        return val;

    }
}
