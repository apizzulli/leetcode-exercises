import java.util.*;

class Solution {
    // public static void main(String[] args) {
    //     letterCombinations("234");
    // }
    public static List<String> letterCombinations(String digits) {
        Map<Character, ArrayList<String>> digsToString = new HashMap<Character, ArrayList<String>>();
        //List<String> allCharsForString = new ArrayList<>();
        List<List<String>> listsOfChars = new ArrayList();
        digsToString.put('2', new ArrayList<String>());
        digsToString.get('2').add("a");
        digsToString.get('2').add("b");
        digsToString.get('2').add("c");   
        digsToString.put('3', new ArrayList<String>());
        digsToString.get('3').add("d");
        digsToString.get('3').add("e");
        digsToString.get('3').add("f");  
        digsToString.put('4', new ArrayList<String>());
        digsToString.get('4').add("g");
        digsToString.get('4').add("h");
        digsToString.get('4').add("i");  
        digsToString.put('5', new ArrayList<String>());
        digsToString.get('5').add("j");
        digsToString.get('5').add("k");
        digsToString.get('5').add("l");  
        digsToString.put('6', new ArrayList<String>());
        digsToString.get('6').add("m");
        digsToString.get('6').add("n");
        digsToString.get('6').add("o");  
        digsToString.put('7', new ArrayList<String>());
        digsToString.get('7').add("p");
        digsToString.get('7').add("q");
        digsToString.get('7').add("r");
        digsToString.get('7').add("s");
        digsToString.put('8', new ArrayList<String>());
        digsToString.get('8').add("t");
        digsToString.get('8').add("u");
        digsToString.get('8').add("v"); 
        digsToString.put('9', new ArrayList<String>());
        digsToString.get('9').add("w");
        digsToString.get('9').add("x");
        digsToString.get('9').add("y"); 
        digsToString.get('9').add("z"); 
        //add all the characters that represent the digits in the string to a list
        //int startOfNext = 0;

        for(int i =0; i < digits.length(); i++){
            char digit = digits.charAt(i);
            listsOfChars.add(digsToString.get(digit));
        }
        List<String> listToReturn = new ArrayList();
        String s = "";
        //loop over the List of Lists
        if(listsOfChars.size()>1){
            for (int i = 0; i < listsOfChars.size()-1; i++){
                List<String> currentList = listsOfChars.get(i);
                //loop over lists to compare to current
                for (int j = i+1; j<listsOfChars.size(); j++){
                    List<String> toCompare = listsOfChars.get(j);
                    //compare all chars in current list to the one for comparison
                    for(int k = 0; k < currentList.size(); k++){
                        //clear string for outer iteration
                        s="";
                        s+= currentList.get(k);
                        for( int n=0; n<toCompare.size(); n++){
                            s+= toCompare.get(n);
                            listToReturn.add(s);
                            //reset string to first char from current list each iteration
                            s = currentList.get(k);
                        }
                    }
                }            
            }
        }
        else{
            return listsOfChars.get(0);
        }
        return listToReturn;
    }
}