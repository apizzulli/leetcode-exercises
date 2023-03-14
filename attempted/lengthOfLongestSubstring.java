import java.util.*;
class Solution {
    public static void main(String[] args) {
        lengthOfLongestSubstring("anviaj");
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.isEmpty())
            return 0;
        // if(s.length()==1)
        //     return 1;
        List<String> allSubstringsWithoutRepeats = new ArrayList();
        String substring = "";
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            if(substring.indexOf(current)>=0){
                //If there is another instance of the given character in the string, end the substring.
                String newString = substring;
                allSubstringsWithoutRepeats.add(newString);
                if(current!=substring.charAt(substring.length()-1)){
                    substring = ""+substring.charAt(substring.length()-1) + current;
                    continue;
                }
                substring=current + "";
            }
            else    
                substring += current;
        }
        allSubstringsWithoutRepeats.add(substring);
        for(String str: allSubstringsWithoutRepeats){
            if (str.length()>max)
                max = str.length();
        }
        return max;
    }
}
