import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        //sorted alphabetically/lexicographically--->hard part copied
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        //capitialize first letter and print them on the same line seperated by a space
        String output = A.substring(0,1).toUpperCase()+ A.substring(1);
        String output1 = B.substring(0,1).toUpperCase()+ B.substring(1);
        System.out.println(output+" "+output1);
    }
}



