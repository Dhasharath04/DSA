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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=head;
        ListNode temp1=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        int[] ar=new int[count];
         int j=0;
         while(temp1!=null)
         {
            ar[j++]=temp1.val;
            temp1=temp1.next;
         }
         for(int i=0;i<count;i++)
         {
            System.out.println(ar[i]);
         }
        int l=left-1;
        int r=right-1;
        while(l<r)
        {
            int t=ar[l];
            ar[l]=ar[r];
            ar[r]=t;
            l++;
            r--;
        }
        ListNode arr=new ListNode(0);
        ListNode arr1=arr;
       for(int i=0;i<count;i++)
       {
        arr1.next=new ListNode(ar[i]);
        arr1=arr1.next;
       }
       ListNode head1=arr.next;
       ListNode d=head1;
       while(d!=null)
       {
        System.out.println(d.val);
        d=d.next;
       }
       return head1;
    }
}