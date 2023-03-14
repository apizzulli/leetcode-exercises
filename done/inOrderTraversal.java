class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        return traverse(root, list);
    }
    public List<Integer> traverse(TreeNode root, List<Integer> intList){
        if(root==null)
            return intList;
        if(root.left!=null)
            traverse(root.left, intList);
        intList.add(root.val);
        if(root.right != null)
            traverse(root.right, intList);
        return intList;
    }
}