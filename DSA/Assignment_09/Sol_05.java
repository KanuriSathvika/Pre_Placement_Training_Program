/**
  **Question 5**

 Given an array of integers **arr**, the task is to find maximum element of that array using recursion.

 **Example 1:**

 Input: arr = {1, 4, 3, -5, -4, 8, 6};
 Output: 8

 **Example 2:**

 Input: arr = {1, 4, 45, 6, 10, -8};
 Output: 45

 */
package Pre_Placement_Assignment.Assignment_09;

public class Sol_05 {
    public static void main(String[] args) {
        int[] arr={1, 4, 3, -5, -4, 8, 6};
        System.out.println(find_max(arr,arr.length));
    }

    private static int find_max(int[] arr, int length) {
        if(length==1){
            return arr[0];
        }
        return Math.max(arr[length-1],find_max(arr,length-1));
    }

}
