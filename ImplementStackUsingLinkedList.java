package SLLPackage;

public class ImplementStackUsingLinkedList {
    private SinglyLinkedList singlyLinkedList;
    private int length;

    public ImplementStackUsingLinkedList() {
        this(10);
    }
    public ImplementStackUsingLinkedList(int length) {
        this.length = length;
        this.singlyLinkedList = new SinglyLinkedList();
    }

    public void Push(int value){
        int size= singlyLinkedList.getLength();
        if(length==size){
            System.out.println("Stack is full");
        }
        else {
            singlyLinkedList.insertAtBegin(value);
        }
    }
    public int Pop(){
        ListNode node= null;
        int size= singlyLinkedList.getLength();
        if(size==0){
            System.out.println("Stack is empty");
            return -1;
        }
        else {
            node = singlyLinkedList.getHead();
            singlyLinkedList.deleteFirstNode();
            return node.getData();
        }
    }
    public int Top(){
        return singlyLinkedList.getHead().getData();
    }
    public void printStack(){
        singlyLinkedList.printLinkList();
    }

}
