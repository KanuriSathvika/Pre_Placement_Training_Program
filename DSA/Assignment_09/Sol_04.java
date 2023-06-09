/**
 **Question 4**

 Given a number N and a power P, the task is to find the exponent of this number raised to the given power, i.e. N^P.

 **Example 1 :**

 Input: N = 5, P = 2

 Output: 25

 **Example 2 :**
 Input: N = 2, P = 5

 Output: 32

 */

package Pre_Placement_Assignment.Assignment_09;

import java.util.Scanner;

public class Sol_04 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double N=sc.nextDouble();
        int P=sc.nextInt();
        System.out.println(powerof(N,P));
    }

    public static double powerof(double n, int p) {
        if(n==0){
            return 0;
        }
        else if(p==0){
            return 1;
        }
        else if(p>0){
            return n*powerof(n,p-1);
        }
        else {
            return (1/n)*powerof(n,p+1);
        }
    }
}
