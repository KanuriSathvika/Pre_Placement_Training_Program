/**

 💡 **Question 1**
 Given three integer arrays arr1, arr2 and arr3 **sorted** in **strictly increasing** order,
 return a sorted array of **only** the integers that appeared in **all** three arrays.

 **Example 1:**

 Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]

 Output: [1,5]

 */

package Pre_Placement_Assignment.Assignment_04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//import com.google.common.collect.Sets;

public class Sol_01 {
    public static void main(String[] args) {
        int[] num1={1,2,3,4,5};
        int[] num2={1,2,5,7,9};
        int[] num3={1,3,4,5,8};
        System.out.println(arraysIntersection(num1,num2,num3));

    }
    public static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
                   List<Integer> val=new ArrayList<>();
                  Set<Integer> set1= new HashSet<Integer>();
                  Set<Integer> set2= new HashSet<Integer>();
                   for(int i=0;i< arr1.length;i++ ){
                       set1.add(arr1[i]);
                   }
                    for(int i=0;i< arr2.length;i++ ){
                        set2.add(arr2[i]);
                    }
                    set1.retainAll(set2);
                    for(int x=0;x<arr3.length;x++){
                        if(set1.contains(arr3[x])){
                            val.add(arr3[x]);
                        }
                    }

                   return val;

    }


    }
