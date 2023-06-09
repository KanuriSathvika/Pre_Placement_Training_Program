/**
 **Question 2**

 Given a number n, find the sum of the first natural numbers.

 **Example 1:**

 Input: n = 3

 Output: 6

 **Example 2:**

 Input  : 5

 Output : 15

 */

package Pre_Placement_Assignment.Assignment_09;

import java.util.Scanner;

public class Sol_02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumof(n));
    }

    public static int sumof(int n) {
        if(n==1){
            return 1;
        }
        return n+sumof(n-1);

    }

}
