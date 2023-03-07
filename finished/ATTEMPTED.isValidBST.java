 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
  }
class Solution {
    //Input: root = [5,1,4,null,null,3,6]
    public static void main(String[] args) {
        TreeNode mainRoot = new TreeNode(5, new TreeNode(1, null, null), new TreeNode(7, new TreeNode(3, null, null), new TreeNode(8, null, null)));
        System.out.println(isValidBST(mainRoot));        
    }
    public static boolean isValidBST(TreeNode root) {
     
    }
    public static boolean traverse(TreeNode root){
        
    }
}