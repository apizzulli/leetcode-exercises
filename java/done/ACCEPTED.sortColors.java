import javax.lang.model.util.ElementScanner14;

class Solution {
    public static void main(String[] args) {
        sortColors(new int[]{1});
    }
    public static void sortColors(int[] nums) {
        int redCount = 0;
        int whiteCount = 0;
        int blueCount = 0;
        boolean countingZeros = true;
        int firstZeroIndex = -1;
        int firstOneIndex = -1;
        int firstTwoIndex = -1;
        for(int index = 0; index < nums.length; index++){
            switch(nums[index]){
                //RED = 0
                case 0: 
                    //swap 0 & 1, 1 & 2
                    if (firstOneIndex < index && firstTwoIndex < index && firstOneIndex != -1 && firstTwoIndex != -1){
                        nums[firstOneIndex] = 0;
                        nums[firstTwoIndex] = 1;
                        nums[index] = 2;
                        firstOneIndex++;
                        firstTwoIndex++;

                    }
                    //swap 0 & 1
                    else if(firstOneIndex < index && firstOneIndex != -1){
                        nums[firstOneIndex] = 0;
                        //If there is more than one 1 and need additional space for 2
                        nums[index] = 1;
                        firstZeroIndex = firstOneIndex;
                        firstOneIndex++;
                    }
                    
                    //SWAP 0 & 2 
                    else if(firstTwoIndex < index && firstTwoIndex != -1){
                        nums[firstTwoIndex] = 0;
                        nums[index] = 2;
                        firstZeroIndex = firstTwoIndex;
                        firstTwoIndex++;
                    }
                
                    break;
                //WHITE = 1
                case 1:
                    //first occurrence of 1, and 2 has not been seen
                    if(firstOneIndex == -1 && firstTwoIndex == -1)
                        firstOneIndex = index;
                    //swap 1 & 2
                    else if(firstTwoIndex < index && firstTwoIndex != -1){
                        nums[firstTwoIndex] = 1;
                        nums[index] = 2;
                        if(firstOneIndex == -1)
                            firstOneIndex = firstTwoIndex;
                        firstTwoIndex++;
                    }
                    break;
                //BLUE = 2
                case 2:
                    //If it is the first occurrence of 2, set the firstTwoIndex to the current index.
                    if(firstTwoIndex == -1)
                        firstTwoIndex = index;
                    //If it is not the first occurrence of a 2, add space for a 
                    // else 
                    //     firstTwoIndex = index+1;
                    //If a 2 is seen 
                    break;
                default: 
                    break;              
            }
        }
        System.out.println("Final nums array: \n");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
            if(i!=nums.length-1)
                System.out.print("->");
        }
    }
}