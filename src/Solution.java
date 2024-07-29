public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
         return dfs(root, val);
    }
    private TreeNode dfs(TreeNode node,int val) {
        if (node != null) {
            if (node.val == val) return node; 
            TreeNode left = dfs(node.left, val);
            if (left != null) return left;
            TreeNode right = dfs(node.right, val);
            if (right != null) return right;
        }
        return null;
    }
}