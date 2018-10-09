package SLLPackage;

public class SinglyLinkedList {
    private ListNode head;

    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    //insert node in beginning
    public  void insertAtBegin(int value){
        ListNode newNode = new ListNode(value);
        if(head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }
    public void insertAtEnd(int value){

        ListNode newNode= new ListNode(value);
        if(head==null){
            head=newNode;
        }
        else{
            ListNode tmp = head;
            for(ListNode listNode=head;listNode!=null;listNode=listNode.getNext()) {
                tmp=listNode;
            }
            tmp.setNext(newNode);

            ////////
//            ListNode tempNode = head;
//            while (tempNode.getNext() != null) {
//                tempNode = tempNode.getNext();
//            }
//            tempNode.setNext(newNode);

        }
    }
    public void InsertInMiddle(int value){
        ListNode newNode = new ListNode(value);
        int middle= findMiddleNode();

        if (middle == 0) {
            head=newNode;
        }
        else{
//            ListNode middleNode=head;
//            for(int i=1;i<middle;i++){
//                middleNode=middleNode.getNext();
//            }
            int length = getLength();
            ListNode middleNode = getMiddleNode(length);
            newNode.setNext(middleNode.getNext());
            middleNode.setNext(newNode);
        }

    }

    public int getLength() {
        if (head == null) {
            return 0;
        } else {
            ListNode node = head;
            int length = 1;
            while (node.getNext()!=null) {
                node = node.getNext();
                length++;
            }
            return length;
        }
    }
    public ListNode getTail(){
        if(head==null){
            return null;
        }
        else {
            ListNode current=head;
            while (current.getNext()!=null){
            current=current.getNext();

            }
            return current;
        }

    }

    public ListNode getMiddleNode(int length) {
        ListNode middleNode=head;
        int middle = (int) Math.floor(((double)length + 1.0)/2);
        for(int i=1;i<middle;i++){
            middleNode=middleNode.getNext();
        }
        return middleNode;
    }
    public int findMiddleNode(){
        float length=0;
        if(head!=null){
            ListNode lengthNode=head;
            length++;
            while(lengthNode.getNext()!=null){
                length++;
                lengthNode=lengthNode.getNext();
            }
        }
         int middleValue= (int)Math.floor((length+1)/2);
        return middleValue;

    }
    public void deleteFirstNode(){
        if(head==null){
            System.out.println("linked list is empty");
        }
        else{
//            ListNode tmp= head;
//            head=tmp.getNext();
            head = head.getNext();
        }
    }
    public void deleteLastNode(){
        if(head==null){
            System.out.println("we have empty linked list");
        }

        else if(head.getNext()==null){
            head=null;
            System.out.println("head is deleted");

        }
        else{
            ListNode previousNode=head,tail=head;
            while(tail.getNext()!=null){
                previousNode=tail;
                tail=tail.getNext();
            }
            previousNode.setNext(null);
        }
    }

    public void deleteMiddleNode(){
        int x= findMiddleNode();
        if(x==0){
            head=null;
            System.out.println("we have empty list");
        }
        else if(x==1){
            head=null;
            System.out.println("we have deleted head now linked list is empty");
        }
        else{
            ListNode tmp=head;
            ListNode tmp1=tmp;
            for(int i=1;i<x;i++){
                tmp1=tmp;
                tmp=tmp.getNext();
            }
            tmp1.setNext(tmp.getNext());

        }
    }

    public void printLinkList() {
        if(head==null){
            System.out.println("we have empty linked list");
        } else {
            for(ListNode l=head;l!=null;l=l.getNext()){
                System.out.println(l.getData());
            }
        }
    }
    public int getPosition(int value) {
        int position=0;
        ListNode positionNode;
//        if(head.getData()==value){
//            position=1;
//        }
//        else{
        for (positionNode = head; positionNode.getData()!=value; positionNode = positionNode.getNext())
        {
            position++;
            if(positionNode.getNext()==null){
                break;
            }

        }
        if(positionNode.getData()==value){
            position++;
        }
        else {
            position=0;
        }
        return position;
    }
    public void removePosition(int position){
        ListNode removeNode= head,previousNode=head;
        if(position<=0){
            removeNode=previousNode;
        }
        else {
            for (int i = 1; i < position; i++) {
                previousNode = removeNode;
                removeNode = removeNode.getNext();
                if (removeNode.getNext() == null) {
                    removeNode = previousNode;
                    break;
                }
            }
        }
        previousNode.setNext(removeNode.getNext());
    }
    public void matchedVaue(int value){
        int x= getPosition(value);
        removePosition(x);
    }
    public ListNode getNodeAtPosition(int value){
        ListNode Node = head;
        for(int i=1; i<value;i++){
            Node=Node.getNext();
        }
        return Node;
    }
//    public ListNode TraverseNthNodeFromEnd(int value){
//        int length = getLength();
//        int n= length-value+1;
//        if(n>0){
//            return getNodeAtPosition(value);
//        }
//        else{
//            return null;
//        }
//
//    }
}

