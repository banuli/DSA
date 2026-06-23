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
    public TreeNode insert(TreeNode head, int val){
        if(head == null){
            TreeNode cur = new TreeNode(val);
            return cur;
        }

        if(val < head.val){
            head.left = insert(head.left,val);
        }else{
            head.right = insert(head.right,val);
        }
        return head;
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            TreeNode cur = new TreeNode(val);
            return cur;
        }
        TreeNode head = root;

        insert(head,val);
        return head;
        
    }
}