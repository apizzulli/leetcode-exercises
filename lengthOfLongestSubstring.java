import java.util.*;

import javax.xml.transform.Templates;
 class Solution {
    public static void main(String args[]){
        lengthOfLongestSubstring("au");
    }
    public static int lengthOfLongestSubstring(String s) {
        List<Character> substring = new ArrayList<>(); 
        int maxLength=0;
        int tempLength=0;
        List<Integer> subLengths = new ArrayList();
        if (s.length()==1)
            return 1;
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if(s.indexOf(c)<i){
                //if this character has been seen, reset max length and add the current length to the array
                subLengths.add(maxLength);
                maxLength=1;
            }
            else
                maxLength++;
        }
        //find the largest of the sublengths
        subLengths.add(maxLength);
        if(!subLengths.isEmpty()){
            int max = 0;
            for(Integer i: subLengths){
                if(i>max)
                    max=i;
            }
            System.out.println("MAX: "+max);
            return max;
        }
        return 0;
    }
}
