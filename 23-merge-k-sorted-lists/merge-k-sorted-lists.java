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
    List<Integer> li=new ArrayList<>();
      for(ListNode node : lists){
            while(node!=null){
                li.add(node.val);
                node=node.next;
            }
      }
      Collections.sort(li);
      ListNode dummy=new ListNode(-1);
      ListNode curr=dummy;
      for(int i:li){
        curr.next=new ListNode(i);
        curr=curr.next;

      }
      return dummy.next;
    }
    
}


