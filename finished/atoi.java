class Atoi {
   
    public static int myAtoi(String s) {
        boolean isNegative= false;
        int startOfInt = 0;
        int numDigits = 0;
        int number = 0;
        int currentPow = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            switch(c){
                case ' ':
                    continue;
                case '+':
                    continue;
                case '-':
                    isNegative = true; 
                    break;
                case '1':
                case '2': 
                case '3':
                case '4':
                case '5': 
                case '6':
                case '7': 
                case '8': 
                case '9': 
                    numDigits=1;
                    //If the char is a digit, it is the beginning of the number. Take note of the index and begin counting the number of digits.                                                            
                    startOfInt = i;
                    for(int j = startOfInt+1; j < s.length(); j++){
                        c= s.charAt(j);      
                        if(c=='0'||c=='1' || c == '2' || c == '3' || c== '4' || c== '5' || c=='6' || c=='7' || c=='8' || c== '9')
                            numDigits++;
                    }
                    currentPow = numDigits - 1;
                    for(int j =startOfInt; j<numDigits+startOfInt; j++){
                        int digit = s.charAt(j) - '0';
                        number += digit*Math.pow(10,currentPow);
                        // if(number == 2147483640 && s.charAt(j+1)-'0' > 7 && isNegative){ //number is out of integer range - return -2^31
                        //     return (int)Math.pow(-2, 31);
                        // }
                        // else if(number >= 2147483640 && s.charAt(j+1)-'0' > 7)
                        //     return (int)Math.pow(2,31) -1;
                        currentPow--;
                    }
                    if(isNegative)
                        number*=-1;
                    System.out.println("Integer is "+ number);
                    if(number == -2147483647)
                        return (int)Math.pow(-2, 31);
                    return number;
                default:
                    return 0;
                 
            }
        }
        return number;
    }
}