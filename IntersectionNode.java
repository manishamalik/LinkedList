package SLLPackage;

public class IntersectionNode {
    public ListNode intersectionode(ListNode node1,ListNode node2){
        ListNode head1= node1;
        ListNode head2= node2;
        int l1=0;
        int l2=0;

        while(head1!=null){
            l1++;
            head1=head1.getNext();
        }

        while(head2!=null){
            l2++;
            head2=head2.getNext();
        }
        int difference;
        if(l1>l2){
            difference= l1-l2;
            head1=node1;
            head2= node2;
        }
        else if(l2>l1){
            difference =l2-l1;
            head1= node2;
            head2= node1;
        }
        else{
            return node1;
        }

        for(int i=0;i<difference;i++){
            head1=head1.getNext();
        }
        while (head1!=null&& head2!=null){
            if(head1==head2){
                return head1;
            }
            head1=head1.getNext();
            head2=head2.getNext();
        }
    return null;

    }
}
