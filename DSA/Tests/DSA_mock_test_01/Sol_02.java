/**
 First Unique Character in a String

 Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 Example 1:
 Input: s = "leetcode"
 Output: 0

 Example 2:
 Input: s = "loveleetcode"
 Output: 2

 Example 3:
 Input: s = "aabb"
 Output: -1

 Constraints:
 a. 1 <= s.length <= 10^5
 b. s consists of only lowercase English letters.
 */

package Pre_Placement_Assignment.Tests.DSA_mock_test_01;

import java.util.Scanner;

public class Sol_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        int mi=Integer.MAX_VALUE;
        for(char ch='a';ch<='z';ch++){
            int val=s.indexOf(ch);
            if(val!=-1 && val==s.lastIndexOf(ch)){
                mi=Math.min(mi,val);
            }
        }
        if(mi==Integer.MAX_VALUE){
            return -1;
        }
        return mi;
    }
}
