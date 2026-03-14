import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

class Solution {
    public static void main(String[] args) {
        isInterleave("hello", "h", "hehllo");
    }
    public static boolean isInterleave(String s1, String s2, String s3) {
        String currentSubstring = "";
        boolean found = false;
        for(int i = 0; i < s3.length(); i++){
            System.out.println("Checking char " + s3.charAt(i));
            found = false;
            if((s1.contains(currentSubstring + s3.charAt(i)))){//|| s2.contains(currentSubstring + s3.charAt(i)))){
                currentSubstring += s3.charAt(i);
                found = true;
               // s1 = s1.substring(s1.indexOf(currentSubstring) + currentSubstring.length());
            }
            if((s2.contains(currentSubstring + s3.charAt(i)))){//|| s2.contains(currentSubstring + s3.charAt(i)))){
                currentSubstring += s3.charAt(i);
                found = true;
            }
            if(!found){
                currentSubstring.substring(currentSubstring.length());
                if(s1.contains(currentSubstring)){
                    s1 = s1.substring(currentSubstring.length());
                }
                if(s2.contains(currentSubstring)){
                    s2 = s2.substring(s2.indexOf(currentSubstring), currentSubstring.length());
                }
            }
        }
        return false;
    }
}