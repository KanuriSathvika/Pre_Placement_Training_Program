/**
 💡 **Question 5**

 Given two integer arrays`nums1`and`nums2`, return*an array of their intersection*. Each element in the result must
 be**unique**and you may return the result in**any order**.

 Input: nums1 = [1,2,2,1], nums2 = [2,2]
 Output: [2]

 */

package Pre_Placement_Assignment.Assignment_11;

import java.util.*;

public class Sol_05 {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));

    }
    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1=new HashSet<Integer>();
        for(int i:nums1){
            set1.add(i);
        }
        Set<Integer> val=new HashSet<Integer>();

        for(int i=0;i<nums2.length;i++){
            if(set1.contains(nums2[i])){
                val.add(nums2[i]);
            }
        }
        List<Integer> unique=new ArrayList<>(val);
        int[] arr=new int[unique.size()];
        for(int x=0;x<unique.size();x++){
            arr[x]=unique.get(x);
        }

        return arr;

    }
}
