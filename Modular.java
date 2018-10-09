package SLLPackage;

public class Modular {
    SinglyLinkedList singlyLinkedList= new SinglyLinkedList();

    public Modular(SinglyLinkedList singlyLinkedList) {
        this.singlyLinkedList = singlyLinkedList;
    }

    public ListNode modularNode(int k){
        ListNode head = singlyLinkedList.getHead();
        int length= 0;
        ListNode modular = null;
        if(k<=0||head==null){
            return null;
        }
        else{
            for(ListNode temp=head;temp!=null;temp=temp.getNext()){
                length++;
                if(length%k==0){
                    modular=temp;
                }
            }
        }

        return modular;
    }
        
}
