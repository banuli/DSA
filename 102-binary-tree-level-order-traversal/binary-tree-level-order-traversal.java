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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root==null)return result;
        q.add(root);

        while(q.size() > 0){
            int count = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i=0;i < count;i++){
                TreeNode cur = q.poll();
                l.add(cur.val);

                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
            result.add(l);
        }
        return result;
        
    }
}