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
    public int maxDepth(TreeNode root) {
        
        int depth = 0;
        if(root == null) {
            return 0;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int size = queue.size();
            
            while(size > 0){
                
                root = queue.remove();
                
                if(root.left != null) {
                    queue.add(root.left);
                }
                
                if(root.right!=null){
                    queue.add(root.right);
                }
                
                size--;
            }
            depth++;    
        }
        return depth;
    }
}
