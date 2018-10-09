package SLLPackage;

public class AdditionOfList {
    SinglyLinkedList list1 = new SinglyLinkedList();
    SinglyLinkedList list2 = new SinglyLinkedList();
    public AdditionOfList(SinglyLinkedList list1, SinglyLinkedList list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public ListNode listAdd() {
        ListNode head2 = list2.getHead();
        ListNode head1 = list1.getHead();
        SinglyLinkedList list = new SinglyLinkedList();
        int sum, carry = 0;
        if (head2 == null) {
            list.setHead(head1);
        } else if (head1 == null) {
            list.setHead(head2);
        } else {
            while (head1 != null || head2 != null) {
                if (head1 == null) {
                    sum = head2.getData() + carry;
                    carry = sum / 10;
                    sum = sum % 10;
                    list.insertAtEnd(sum);
                    head2 = head2.getNext();
                } else if (head2 == null) {
                    sum = head1.getData() + carry;
                    carry = sum / 10;
                    sum = sum % 10;
                    list.insertAtEnd(sum);
                    head1 = head1.getNext();
                } else {
                    sum = head1.getData() + head2.getData() + carry;
                    carry = sum / 10;
                    sum = sum % 10;
                    list.insertAtEnd(sum);
                    head1 = head1.getNext();
                    head2 = head2.getNext();
                }
            }
            if (carry != 0) {
                list.insertAtEnd(carry);
            }
        }

        return list.getHead();

    }
}
