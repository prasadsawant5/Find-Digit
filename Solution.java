import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String n;
        int num, count, divide = 0, len, digit;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        count = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < count; i++) {
            n = br.readLine();
            len = n.length();
            num = Integer.parseInt(n);
        
            for (int j = 0; j < len; j++) {
                try {
                    digit = num % 10;
                    if (digit != 0)
                        if (num % digit == 0)
                            divide++;
                    num = num / 10;
                } catch (Exception e) {
                    
                }
            }
        
            System.out.println(divide);
            divide = 0;
        }
        
        
    }
}
