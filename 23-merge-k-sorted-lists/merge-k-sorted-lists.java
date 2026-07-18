/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->(a.val-b.val));

        for(int i=0;i<n;i++){
            if(lists[i] != null){
                ListNode temp = lists[i];
                pq.add(temp);
            }

        }

        ListNode ans = new ListNode(0);
        ListNode cur = ans;

        while(pq.size() > 0){
            ListNode node = pq.poll();
            cur.next = node;
            cur = cur.next;
            if(node.next != null){
                node = node.next;
                ListNode temp =  node;
                pq.add(temp); 
            }
        }
        return ans.next;
    }
}