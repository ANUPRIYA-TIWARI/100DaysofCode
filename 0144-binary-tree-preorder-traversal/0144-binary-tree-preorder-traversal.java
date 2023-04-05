/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversalHelper(list, root);
        return list;
    }

    private void preorderTraversalHelper(List<Integer> list, TreeNode root) {
        if (root != null) {
            list.add(root.val);
            preorderTraversalHelper(list, root.left);
            preorderTraversalHelper(list, root.right);
        }
    }
}
        
    
