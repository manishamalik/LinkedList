package SLLPackage;

public class SplitEvenOddNode {
    SinglyLinkedList singlyLinkedList= new SinglyLinkedList();

    public SplitEvenOddNode(SinglyLinkedList singlyLinkedList) {
        this.singlyLinkedList = singlyLinkedList;
    }
    public ListNode spitAndMerge(){
        int length=0;
        ListNode current = singlyLinkedList.getHead();
        SinglyLinkedList evenList = new SinglyLinkedList();
        SinglyLinkedList oddList = new SinglyLinkedList();
        ListNode odd;

        while(current!=null){
            length++;
            if(length%2==0){
                evenList.insertAtEnd(current.getData());
            }
            else{
                oddList.insertAtEnd(current.getData());
            }
            current= current.getNext();
        }

        ListNode headEven = evenList.getHead();
        ListNode tailEven = evenList.getTail();
        ListNode headOdd= oddList.getHead();
        tailEven.setNext(headOdd);
        return headEven;
    }
}
