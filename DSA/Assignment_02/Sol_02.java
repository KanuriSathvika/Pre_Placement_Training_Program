/**
 Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started
 to gain weight, so she visited a doctor.
 The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice
 likes her candies very much, and she wants to eat the maximum number of different types of
 candies while still following the doctor's advice.
 Given the integer array candyType of length n, return the maximum number of different types
 of candies she can eat if she only eats n / 2 of them.
 Example 1:
 Input: candyType = [1,1,2,2,3,3]
 Output: 3
 Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one
 of each type
 */

package Pre_Placement_Assignment.Assignment_02;

import java.util.Arrays;
import java.util.HashSet;

public class Sol_02 {
    public static void main(String[] args) {
        int[] candyType= {1,1,2,2,3,3};
        System.out.println(distributeCandies(candyType));
    }
    public  static int distributeCandies(int[] candyType) {
        Integer[] candy=new Integer[candyType.length];
        for(int i=0;i<candyType.length;i++){
            candy[i]=candyType[i];
        }
        HashSet<Integer> unique=new HashSet<>(Arrays.asList(candy));
        int uni_len=unique.size();
        if(uni_len>=candyType.length/2){
            return candy.length/2;
        }
        return uni_len;
    }
}
