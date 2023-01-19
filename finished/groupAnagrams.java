import java.util.ArrayList;

import java.util.*;
class Solution {
    public static void main(String[] args) {
        groupAnagrams(new String[]{"ab"});
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        boolean passed = true;
        List<List<String>> listsToReturn = new ArrayList<>();
        for(int currentIndex = 0; currentIndex < strs.length; currentIndex++){
            List<String> currentStrList = new ArrayList<>();
            String currentStr = strs[currentIndex];
            // if(currentStr.length() == 0)
            //     continue;
            for(int compareIndex = 0; compareIndex < strs.length; compareIndex++){
           // for(String toCompare: strs){
                String toCompare = strs[compareIndex];
                if(toCompare == null || currentStr == null) //If either of the strings is null, it has already been seen
                    continue;
                // if(toCompare.length() == 0)
                //     continue;
                System.out.println("Comparing " + currentStr + " to " + toCompare + ".");
                if(currentStr.length() != toCompare.length())
                    continue;
                for(int j = 0; j < currentStr.length(); j++){
                    if(!toCompare.contains(currentStr.charAt(j)+"")){
                        passed = false;
                        break;
                    }
                }
                if(passed){
                    currentStrList.add(toCompare);
                    strs[compareIndex] = null;
                }
                passed = true;
            }
            System.out.println("New list: ");
            for(String s:currentStrList){
                System.out.println(s);
            }
            if(currentStrList.size()>0)
                listsToReturn.add(currentStrList);
        }
        return listsToReturn;
    }
}