/**
  **Question 6**

 Given first term (a), common difference (d) and a integer N of the Arithmetic Progression series,
 the task is to find Nth term of the series.

 **Example 1:**

 Input : a = 2 d = 1 N = 5
 Output : 6
 The 5th term of the series is : 6

 **Example 2:**

 Input : a = 5 d = 2 N = 10
 Output : 23
 The 10th term of the series is : 23

 */

package Pre_Placement_Assignment.Assignment_09;

import java.util.Scanner;

public class Sol_06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int d=sc.nextInt();
        int N= sc.nextInt();
        System.out.println(arithmetic_Nth_term(a,d,N));
    }

    public static long arithmetic_Nth_term(int a, int d, int n) {
        if(n==1){
            return a;
        }
        return d+arithmetic_Nth_term(a,d,n-1);
    }

}

