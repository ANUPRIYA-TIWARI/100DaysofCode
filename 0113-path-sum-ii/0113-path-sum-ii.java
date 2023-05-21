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
public class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root == null) return res;
        build(root, new ArrayList<Integer>(), 0, sum);
        return res;
    }

    void build(TreeNode root, List<Integer> list, int cur, int target){
        if(root.left == null && root.right == null){
            if(cur + root.val == target){
                list.add(root.val);
                res.add(new ArrayList<>(list));
                list.remove(list.size()-1);
            }
            return;
        }
        list.add(root.val);
        if(root.left != null) build(root.left, list, cur+root.val, target);
        if(root.right != null) build(root.right, list, cur + root.val, target);
        list.remove(list.size()-1);
    }
}