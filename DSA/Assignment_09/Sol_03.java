/***
  **Question 3**

 ****Given a positive integer, N. Find the factorial of N.

 **Example 1:**

 Input: N = 5

 Output: 120

 **Example 2:**

 Input: N = 4

 Output: 24

 */


package Pre_Placement_Assignment.Assignment_09;

import java.util.Scanner;

public class Sol_03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
     public static long factorial(int N){
        // code here
        if(N==0 || N==1){
            return 1;
        }
        return N*factorial(N-1);
    }
}
