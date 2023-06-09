/**
  **Question 8**

 Given an array, find a product of all array elements.

 **Example 1:**

 Input  : arr[] = {1, 2, 3, 4, 5}
 Output : 120
 **Example 2:**

 Input  : arr[] = {1, 6, 3}
 Output : 18

 */
package Pre_Placement_Assignment.Assignment_09;

public class Sol_08 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(productof(arr,arr.length));

    }

    public static long productof(int[] arr, int len) {
        if(len==1){
            return arr[0];
        }
        return arr[len-1]*productof(arr,len-1);
    }
}
