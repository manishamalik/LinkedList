package SLLPackage;

public class partition {
    SinglyLinkedList singlyLinkedList= new SinglyLinkedList();

    public partition(SinglyLinkedList singlyLinkedList) {
        this.singlyLinkedList = singlyLinkedList;
    }

    public ListNode partitionAccToKNode(int k){
        ListNode  kNode=null;
        ListNode current = singlyLinkedList.getHead();
        SinglyLinkedList lessList = new SinglyLinkedList();
        SinglyLinkedList greaterList = new SinglyLinkedList();
        while (current!=null) {
            if (current.getData() > k) {
                greaterList.insertAtEnd(current.getData());

            }else if(current.getData()==k){
                kNode.setData(k);
            }
            else {
                lessList.insertAtEnd(current.getData());
            }
            current=current.getNext();
        }
        ListNode tail = lessList.getTail();
        ListNode head = lessList.getHead();
        ListNode head1 = greaterList.getHead();
        if(kNode!= null){
            tail.setNext(kNode);
            kNode.setNext(head1);
        }
        return head;
    }
}
