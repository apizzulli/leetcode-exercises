 class IntToRoman {
    // public static void main(String[] args) {
    //     intToRoman(1994);
    // }
    public static String intToRoman(int num) {
        int pow = 3;
        String romanNums = "";
        while(num > 0){
            
            int thousands=num/1000;
            num-=thousands*1000;
            if(thousands>=1){
                //get rid of the thousands place
                while(thousands>0){ //add appropriate number of M's
                    romanNums+='M';
                    thousands--;
                }      
            }

            int hundreds = num/100;
            num -= hundreds*100;
            if(hundreds >= 1){
                if(hundreds < 4){
                    while(hundreds>0){
                        romanNums += "C";
                        hundreds--;
                    }
                }
                else if(hundreds == 4){
                    romanNums += "CD";
                }
                else if(hundreds >= 5 && hundreds<9){ // 5-8
                    romanNums += "D";
                    hundreds -= 5;
                    if(hundreds > 0){
                        while(hundreds > 0){
                            romanNums += "C";
                            hundreds--;
                        }
                    }
                }
                else if(hundreds == 9){
                    romanNums += "CM";
                }
            }

            int tens = num/10;
            num -= tens * 10;
            if(tens>=1){
                if (tens < 4){
                    while(tens > 0){
                        romanNums += "X";
                        tens--;
                    }
                }
                else if(tens == 4){
                    romanNums += "XL";
                }
                else if(tens >= 5 && tens<9){
                    romanNums += "L";
                    tens-=5;
                    if(tens>0){
                        while(tens>0){
                            romanNums+="X";
                            tens--;
                        }
                    }
                }
                else if(tens==9){
                    romanNums += "XC";
                }
            }

            int ones = num;
            if(ones>0){
                if(ones <4){
                    while(ones>0){
                        romanNums += "I";
                        ones --;
                    }
                }
                else if (ones==4){
                    romanNums += "IV";
                }
                else if(ones >= 5 && ones < 9){
                    romanNums += "V";
                    ones -=5;
                    if(ones>0){
                        while(ones>0){
                            romanNums+="I";
                            ones--;
                        }
                    }
                }
                else if(ones==9){
                    romanNums+="IX";
                }
                num=0;
            }
        }
        System.out.println(romanNums);
        return romanNums;
    }
}