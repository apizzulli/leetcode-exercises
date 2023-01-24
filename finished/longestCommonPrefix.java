class Solution {
    public static void main(String[] args) {
        // String []  strs = {"fighter", "farthest", "furthest", "fat", "fallacy", "further", "fall", "fallen", "fell"};
        // longestCommonPrefix(strs);
  
    }
    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if(strs.length >= 1){
            prefix = strs[0];
            int chop = prefix.length();
            for(int arrayIndex = 1; arrayIndex < strs.length; arrayIndex++){
                String current = strs[arrayIndex];
                if(prefix.length() > current.length()){
                    //if the size of the prefix is larger than the current string or vice versa, the longest possible match is the prefix matched to the size of the current string
                    prefix = prefix.substring(0, current.length());
                    chop = current.length() - 1;
                }
                else if(current.length() > prefix.length()){
                    current = current.substring(0, prefix.length());
                    chop = prefix.length() - 1;
                }
                System.out.println("Comparing current prefix "+ prefix + " to " + current);
                while(!prefix.equals(current)){
                    prefix = prefix.substring(0, chop);
                    current = current.substring(0, chop);
                    System.out.println("Comparing current prefix "+ prefix + " to " + current);
                    chop--;
                   // System.out.println("Checking "+ toCheck + "(to check) against current prefix " + prefix);
                }
                System.out.println("Match! Moving on\n");
            }
        }
        System.out.println("Longest common prefix: "+ prefix);
        return prefix;
    }
}