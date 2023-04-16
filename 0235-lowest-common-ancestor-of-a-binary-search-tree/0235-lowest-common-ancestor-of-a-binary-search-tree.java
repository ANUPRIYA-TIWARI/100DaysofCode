/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    TreeNode t = root;
 
    while(t!=null){
        if(p.val >t.val && q.val >t.val){
            t = t.right;
        }else if (p.val<t.val && q.val<t.val){
            t = t.left;
        }else{
            return t;
        }
    }
 
    return null;
}
        
    }