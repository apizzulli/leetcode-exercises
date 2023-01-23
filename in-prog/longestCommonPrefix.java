class Solution {
    public static void main(String[] args) {
        String [] array = {"flower","flow","flight"};
        Solution s = new Solution();
        s.longestCommonPrefix(array);
    }
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        if(strs.length == 0 || prefix=="")
            return "";
        for(int i = 1; i < strs.length; i++){
            String current = strs[i];
            String temp = current;
            while(!temp.equals(prefix)){
                temp = current.substring(0,temp.length()-1);
            }
        }
        return prefix;
    }
}