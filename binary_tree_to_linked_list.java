class Solution {
    TreeNode res;
    
    public void flatten(TreeNode root) {
        res = new TreeNode(0);
        solve(root);
    }
    
    void solve(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        res.left = null;
        res.right = root;
        res = res.right;
        solve(left);
        solve(right);
    }
}
