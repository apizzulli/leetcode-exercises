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

    public static void main(String[] args) {
        
    }

    public static int minDepth(TreeNode root) {
        return findMin(root, 1);
    }
    public static int findMin(TreeNode node, int min){
        if(node.left==null && node.right==null)
            return min;
        else if(node.left !=null && node.right == null){
            return findMin(node.left, min++);
        }
        else if(node.right != null && node.right==null){
            return findMin(node.right, min);
        }

            return 0;
    }
   }