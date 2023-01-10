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
    public TreeNode sortedArrayToBST(int[] nums) {
        return binTree(0, nums.length-1, nums);
    }
    TreeNode binTree(int lt, int rt, int n[])
    {
        if(lt > rt)
        {
            return null;
        }
        int mid = (lt + rt)/2;
        TreeNode root = new TreeNode(n[mid]);
        root.left = binTree(lt,mid - 1,n);
        root.right = binTree(mid+1, rt, n);
        return root;
    }
}
