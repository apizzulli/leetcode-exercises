package finished;
class Solution {
    public static void main(String[] args) {
        divide(-2147483648, -1);
    }
    public static int divide(int dividend, int divisor) {
        boolean negate = false;
        boolean divisorNeg = false;
        boolean dividendNeg=false;
        int newDividend=0; //If the dividend/divisor is negative, add it to itself twice to make it positive so the process is simpler.
        int newDivisor = 0;  
        int two = 2;
        if(dividend < 0 && divisor > 0){
            if(Math.abs(dividend)==divisor)
                return 0 -divisor;
            newDividend = Math.abs(dividend);
            // while(two>0){
            //     newDividend += dividend;
            //     two--; 
            // }
            negate = true;
        }
        else if(dividend > 0 && divisor < 0){
            if(Math.abs(divisor)==dividend)
                return 0-dividend;
            newDivisor = Math.abs(divisor);
            // two = 2;
            // while(two>0){
            //     newDivisor += Math.abs(two)divisor;
            //     two--; 
            // }
            negate = true;
        }
        else if(dividend < 0 && divisor < 0){
            if(divisor==dividend)
                return 1;
            dividend = Math.abs(dividend);
            divisor = Math.abs(divisor);
        }
        else if(dividend == divisor)
            return 1;
        int quotient = 0;
        int tempDivisor=divisor;
        if(newDivisor != 0)
            tempDivisor = newDivisor;
        while(tempDivisor < dividend  ){
            if(newDivisor!=0){
                tempDivisor += newDivisor;
            }
            else
                tempDivisor += divisor;
            quotient++;
        }
     
        int newQuo = 0;
        if(negate){
           newQuo -= quotient;
           quotient = newQuo;
        }
        System.out.println("Quotient = "+ quotient);
        return quotient;
    }
}