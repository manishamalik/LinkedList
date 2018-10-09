package SLLPackage;

public class RotateList {
    SinglyLinkedList singlyLinkedList= new SinglyLinkedList();
    public ListNode rotateKNode(int k){
        ListNode head =singlyLinkedList.getHead();
        ListNode current= head;
        ListNode prev= null;
        if(head==null){
            return null;
        }
        else if(head.getNext()==null){
            return head;
        }
        else {
            for (int i = 1; i <= k; i++) {
                while (current.getNext() != null) {
                    prev = current;
                    current = current.getNext();
                }
                prev.setNext(null);
                current.setNext(head);
                head = current;
            }
        }
        return head;
    }

    public RotateList(SinglyLinkedList singlyLinkedList) {
        this.singlyLinkedList = singlyLinkedList;
    }
}
