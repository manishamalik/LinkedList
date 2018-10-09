package SLLPackage;

public class IsListEvenOdd {
    public boolean evenList(ListNode head){
        ListNode node=head;
        int length=0;
        while(node!=null){
            length++;
            node.getNext();
        }
        return length % 2 == 0;
    }
    public ListNode mergeTwoList(ListNode head1, ListNode head2){
        ListNode head=new ListNode(0);
        if(head1==null){
            return head2;
        }
        else if(head2==null){
            return head1;
        }
        else if(head1.getData()<head2.getData()){
            head= head1;
            head.setNext(mergeTwoList(head1.getNext(),head2));
        }
        else {
            head=head2;
            head.setNext(mergeTwoList(head2.getNext(),head1));

        }
        return head;
    }
}
