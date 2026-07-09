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
    public ListNode findMid(ListNode temp){
        if(temp == null || temp.next == null) return temp;

        ListNode slow = temp;
        ListNode fast = temp.next.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode merge(ListNode l1, ListNode l2){
        
        // base case
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode ans = null;

        // add the first node which is smallest
        if(l1.val < l2.val){
            ans = l1;
            l1 = l1.next;
        }else{
            ans = l2;
            l2 = l2.next;
        }
        ListNode cur = ans;

        // merge sort
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        while(l1 != null){
            cur.next = l1;
            l1 = l1.next;
            cur = cur.next;
        }

        while(l2 != null){
            cur.next = l2;
            l2 = l2.next;
            cur = cur.next;
        }
        return ans;
    }
    public ListNode mergeSort(ListNode head){
        if(head == null || head.next == null) return head;
        
        ListNode mid = findMid(head);
        ListNode midNext = mid.next;
        mid.next = null;

        ListNode left = mergeSort(head);
        ListNode right = mergeSort(midNext);

        ListNode ans = merge(left,right);
        return ans;
    }
    public ListNode sortList(ListNode head) {

        // sort list using merge sort
        return mergeSort(head);
        
    }
}