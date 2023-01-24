import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

class Solution {
    // public static void main(String[] args) {
    //     trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
    // }
    public static int trap(int[] height) {
        int finalHeight = 0, currentVal = 0 , currentMax = 0, maxIndex = 0, runningSum = 0;
        boolean finished = false, counting = false;
        for(int currentIndex = 0; currentIndex < height.length; currentIndex++){
            currentVal = height[currentIndex];
            //If a new max is encountered, take note of its index and begin counting the units of rainwater.
            if(currentMax==3)
                System.out.println("hey");
            if(currentVal >= currentMax){
                currentMax = currentVal;
                maxIndex = currentIndex;
                finalHeight += runningSum;
                runningSum = 0;
                counting = true;
            }
            if(counting)
                runningSum += currentMax - currentVal;
            //Don't count if still on the new max
        }
        counting = false;
        //If the max is not the end of the array, check and make sure there aren't any missing units by counting starting at the maxIndex
        if(maxIndex < height.length-1){ 
            currentMax = 0;  
            for(int currentIndex = maxIndex+1; currentIndex < height.length; currentIndex++){
                currentVal = height[currentIndex];
                //If a new max is encountered, take note of its index and begin counting the units of rainwater.
                if(currentVal >= currentMax){
                    currentMax = currentVal;
                    maxIndex = currentIndex;
                    counting = true;
                }
                //Don't count if still on the new max
                if(counting && currentIndex > maxIndex){
                    runningSum += currentMax - currentMax;
                }
            }
        }
        return finalHeight;
    }
}
