package SLLPackage;

public class TraverseNthNode {
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    int length = singlyLinkedList.getLength();
//    public void TraverseNthNodeFromEnd(int value){
//        int n= length-value;
//        if(n>0){
//            singlyLinkedList.getNodeAtPosition(n);
//        }

    public TraverseNthNode(SinglyLinkedList singlyLinkedList) {
        this.singlyLinkedList = singlyLinkedList;
    }

    public ListNode TraverseNthNodeFromEnd(int value){
    //int length = getLength();
    int n= length-value+1;
    if(n>0){
        return singlyLinkedList.getNodeAtPosition(value);
    }
    else{
        return null;
    }

  }
}

