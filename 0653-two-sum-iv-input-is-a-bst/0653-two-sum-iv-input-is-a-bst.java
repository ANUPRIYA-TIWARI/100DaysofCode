class Solution {

    Set set=new HashSet<Integer>();
    public boolean findTarget(TreeNode root, int k) {
        return helper(root, k);
    }

    private boolean helper(TreeNode root,int k){
        if(root==null){
            return false;
        }
        if(set.contains(k-root.val)){
            return true;
        }
        set.add(root.val);
        return helper(root.left, k)||helper(root.right, k);
    }
}