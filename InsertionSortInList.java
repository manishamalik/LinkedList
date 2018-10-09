package SLLPackage;


public class InsertionSortInList {
    public ListNode ImplementInsertionSort(ListNode head){
        ListNode startPtr=head;
        ListNode outPtr= head.getNext();
        if(head==null ||head.getNext()==null){
            return head;
        }
        else {
            while(outPtr!=null) {
                if (startPtr.getData() < outPtr.getData()) {
                    outPtr = outPtr.getNext();
                }
//                else if(startPtr.getData())
            }
        }
        return head;
    }
}
