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
    public TreeNode deleteN(TreeNode root, int key) {
        if(root == null) return null;

        // if key is on the left
        if(key < root.val){
            root.left = deleteN(root.left,key);

        }else if(key > root.val){
            // key is on the right
            root.right = deleteN(root.right,key);
        }else{
            // root.val == key
            // 1.check if its a leaf node
            if(root.left == null && root.right == null){
                return null;
            }else if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
                TreeNode temp = root.left;
                while(temp.right != null){
                    temp = temp.right;
                }
                root.val = temp.val;
                root.left = deleteN(root.left,temp.val);
            }
        }
        
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        return deleteN(root,key);
    }
}