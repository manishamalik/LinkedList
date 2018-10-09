package SLLPackage;

public class TraverseNthNodeFromEnd {
    SinglyLinkedList singlyLinkedList= new SinglyLinkedList();


    public TraverseNthNodeFromEnd(SinglyLinkedList singlyLinkedList) {
        this.singlyLinkedList = singlyLinkedList;
    }

    public ListNode EndTraverse(int value){
        int length = singlyLinkedList.getLength();
//        if(length>value){}
        if(singlyLinkedList.getHead()==null){
            return null;
        }
        else if(length>=value){
            ListNode EndPtr =singlyLinkedList.getHead(), FirstPointer= singlyLinkedList.getHead();
            for(int i=1;i<value;i++){
                FirstPointer= FirstPointer.getNext();
            }
            while(FirstPointer.getNext()!=null){
                EndPtr= EndPtr.getNext();
                FirstPointer=FirstPointer.getNext();
            }
            if(EndPtr!=null){
                return EndPtr;
            }
            return null;

        }
        else{
            System.out.println("you choose wrong value");
            return null;
        }
    }
}
