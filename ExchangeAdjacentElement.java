package SLLPackage;

public class ExchangeAdjacentElement {
    SinglyLinkedList singlyLinkedList;

    public ExchangeAdjacentElement(SinglyLinkedList singlyLinkedList) {
        this.singlyLinkedList = singlyLinkedList;
    }

    public void exchangeAdjacentNode(){
        ListNode head = singlyLinkedList.getHead();
        ListNode current = singlyLinkedList.getHead();
        if(current==null || current.getNext() == null){
//            return null;
        }
        else{
            head = current.getNext();
            ListNode prev = current;
            ListNode next = current.getNext();
            current.setNext(next.getNext());
            next.setNext(current);
            current= current.getNext();

            while(current!=null && current.getNext()!=null){
                next = current.getNext();
                prev.setNext(next);
                current.setNext(next.getNext());
                next.setNext(current);
                prev=current;
                current=current.getNext();

            }
        }
        singlyLinkedList.setHead(head);
//            return head;
        singlyLinkedList.printLinkList();
    }


}
