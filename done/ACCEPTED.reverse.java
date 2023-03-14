import java.util.*;
class Solution {
    public static void main(String[] args) {
       
        reverse(-2147483648);
    }
    public static int reverse(int x) {
        List<Integer> digits = new ArrayList();
        int powOf10 = 0, digit = 0, maxPow10 = 9, index=0, newInt = 0;
        boolean xIsNegative = false;
        if(x < 1){
            xIsNegative = true;
            x = Math.abs(x);
        }

        while(x - Math.pow(10, maxPow10) < 0){
            maxPow10--;
        }
        powOf10 = maxPow10;
        while(x > 0){
            digit = x / (int)Math.pow(10,powOf10);
            digits.add(digit);
            x -= Math.pow(10, powOf10) * digit;
            powOf10--;
        }
        for(Integer currentDig: digits){
            //outside range
            if(newInt>= 147483647 && currentDig >1 )
                return 0;
            newInt += currentDig * (int)Math.pow(10, index);
            index++;
        }
        if(xIsNegative)
            return newInt*-1;
        return newInt;
    }
}