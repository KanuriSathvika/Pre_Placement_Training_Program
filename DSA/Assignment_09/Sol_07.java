/**
 **Question 7**

 Given a string S, the task is to write a program to print all permutations of a given string.

 **Example 1:**

 ***Input:***

 *S = “ABC”*

 ***Output:***

 *“ABC”, “ACB”, “BAC”, “BCA”, “CBA”, “CAB”*

 **Example 2:**

 ***Input:***

 *S = “XY”*

 ***Output:***

 *“XY”, “YX”*

 */

package Pre_Placement_Assignment.Assignment_09;
public class Sol_07 {
    public static void main(String[] args) {
        per("ABC","");
    }
    static  void per(String s,String p){
        if(s.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch=s.charAt(0);
        for(int i=0;i<=p.length();i++){
            per(s.substring(1),p.substring(i,p.length())+ch+p.substring(0,i));
        }
    }
}
