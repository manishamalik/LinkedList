package SLLPackage;

public class ReverseSLList {
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

    public ReverseSLList(SinglyLinkedList singlyLinkedList) {
        this.singlyLinkedList = singlyLinkedList;
    }
    public void reverseSLL(){
        ListNode current = singlyLinkedList.getHead();
        ListNode prev = null;
        while (current!=null){
            ListNode next= current.getNext();      // save next node
            current.setNext(prev);
            prev= current;
            current= next;
        }

        singlyLinkedList.setHead(prev);
    }


}
