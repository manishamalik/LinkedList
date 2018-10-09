package SLLPackage;

public class ReverseKNode {

    public ListNode reverseBlockOfKNode(ListNode head,int k){
        ListNode current=head;
        ListNode prev=null;
        ListNode next= null;
        int counter= k;
        while(current!=null&&counter==0){
            next= current.getNext();
            current.setNext(prev);
            prev= current;
            current= next;
            counter--;
        }
        if (next!=null){
            head.setNext(reverseBlockOfKNode(next,k));
        }
        return prev;
    }
}
