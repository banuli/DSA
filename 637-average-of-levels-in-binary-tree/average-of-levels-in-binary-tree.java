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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        
        if(root == null)return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(q.size() > 0){
            int size = q.size();
            double count = 0;
            for(int i=0;i<size;i++){
                TreeNode cur = q.poll();
                count += cur.val;
                if(cur.left != null){
                    q.add(cur.left);
                }
                if(cur.right != null){
                    q.add(cur.right);
                }
            }
            result.add((double) (count/(double)size));
        }
        return result;
    }
}