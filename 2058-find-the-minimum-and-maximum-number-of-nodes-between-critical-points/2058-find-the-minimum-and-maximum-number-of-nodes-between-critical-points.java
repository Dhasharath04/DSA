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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> list=new ArrayList<>();
        while(head!=null)
        {
            list.add(head.val);
            head=head.next;
        }

        List<Integer> result=new ArrayList<>();
        for(int i=1;i<list.size()-1;i++)
        {
            if(list.get(i-1)>list.get(i) && list.get(i+1)>list.get(i))
            {
                result.add(i+1);
            }

            if(list.get(i-1)<list.get(i) && list.get(i+1)<list.get(i))
            {
                result.add(i+1);
            }
        }
        if(result.size()<=1)
        {
            return new int[]{-1,-1};
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        Collections.sort(result);
        int n=result.size();

        for(int i=1;i<n;i++)
        {
            
            max=Math.max(max,result.get(i)-result.get(i-1));
            min=Math.min(min,result.get(i)-result.get(i-1));
        }
        max=Math.max(max,result.get(result.size()-1)-result.get(0));

        return new int[]{min,max};
        
    }
}