import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        findMedianSortedArrays(new int[]{1,2,5,6,8}, new int[]{1,2,3,4,5,6,8,9,12});
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int p1 =0, p2= 0, actualIndex=0, totalLength = nums1.length+nums2.length, n1=0, n2=0;
        int indexOfMiddle = totalLength/2;
        boolean found = false;
        boolean p1Done = false;
        boolean p2Done = false;
        List<Integer> combinedList = new ArrayList();
        while(combinedList.size() < (totalLength))/*for(int n1 =0, n2 = 0; n1<totalLength;)*/{
            if(n1<nums1.length)
                p1 = nums1[n1];
            else    
                p1Done = true;
            if(n2<nums2.length)
                p2 = nums2[n2];
            else   
                p2Done = true;
            //swap p1 & p2 if they're out of order
            if(p1Done && !p2Done){
                combinedList.add(p2);
                if(actualIndex>=1){
                    if(combinedList.get(actualIndex-1)>combinedList.get(actualIndex)){
                        int temp = combinedList.get(actualIndex-1);
                        combinedList.set(actualIndex-1, combinedList.get(actualIndex));
                        combinedList.set(actualIndex,temp);
                    }
                }
                n2++;
                continue;
            }
            else if(!p1Done && p2Done){
                combinedList.add(p1);
                if(actualIndex>=1){
                    if(combinedList.get(actualIndex-1)>combinedList.get(actualIndex)){
                        int temp = combinedList.get(actualIndex-1);
                        combinedList.set(actualIndex-1, combinedList.get(actualIndex));
                        combinedList.set(actualIndex,temp);
                    }
                }
                n1++;
                continue;
            }
            if(p1<=p2 ){
                combinedList.add(p1);
                //if the new element and the previous need to be switched
                if(actualIndex>=1){
                    if(combinedList.get(actualIndex-1)>combinedList.get(actualIndex)){
                        int temp = combinedList.get(actualIndex-1);
                        combinedList.set(actualIndex-1, combinedList.get(actualIndex));
                        combinedList.set(actualIndex,temp);
                    }
                }
                combinedList.add(p2);
                if(actualIndex>=1){
                    if(combinedList.get(actualIndex-1)>combinedList.get(actualIndex)){
                        int temp = combinedList.get(actualIndex-1);
                        combinedList.set(actualIndex-1, combinedList.get(actualIndex));
                        combinedList.set(actualIndex,temp);
                    }
                }
                n1++;
                n2++;
                actualIndex +=2;
            } 
            else if(p1 > p2){
                combinedList.add(p2);
                n2++;
                actualIndex = actualIndex ++;
            }

           
            //actualIndex  = 2
            //actualIndex-1 = 3
        }           
        if(totalLength % 2 == 0){
            double toReturn = (double)((double)(combinedList.get(indexOfMiddle-1)+combinedList.get(indexOfMiddle))/2);
            System.out.println("\n\n" + toReturn);
            return toReturn;
        }
        else {
            double toReturn = (double)combinedList.get(indexOfMiddle);
            System.out.println("\n\n" + toReturn);
            return toReturn;
        }
    }
}