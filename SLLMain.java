package SLLPackage;
public class SLLMain {
    public static void main(String ar[]){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
//        TraverseNthNodeFromEnd traverseNthNodeFromEnd = new TraverseNthNodeFromEnd(singlyLinkedList);
//        ReverseSLList reverseSLList= new ReverseSLList(singlyLinkedList);
//
//        singlyLinkedList.printLinkList();
//        singlyLinkedList.deleteFirstNode();
//        singlyLinkedList.deleteLastNode();
//        singlyLinkedList.deleteMiddleNode();
//        System.out.println("---------------------------");
//
//        // 1
//        singlyLinkedList.insertAtEnd(5);
//        singlyLinkedList.InsertInMiddle(8);
//        singlyLinkedList.deleteMiddleNode();
////        singlyLinkedList.deleteLastNode();
//        singlyLinkedList.insertAtBegin(1);
//        singlyLinkedList.printLinkList();
//
//        System.out.println("---------------------------");
//
//        // 2 ->1
//        singlyLinkedList.insertAtBegin(2);
//        singlyLinkedList.InsertInMiddle(9);
//        singlyLinkedList.deleteMiddleNode();
//        singlyLinkedList.printLinkList();
//        System.out.println("---------------------------Tail = "+singlyLinkedList.getTail().getData());
////
//
//        //3 ->2->1
//        singlyLinkedList.InsertInMiddle(6);
//
//
//        System.out.println("---------------------------");
//
//
//        singlyLinkedList.insertAtBegin(3);
//        singlyLinkedList.insertAtEnd(5);
//        singlyLinkedList.insertAtBegin(7);
//        singlyLinkedList.printLinkList();
//
//        System.out.println("---------------------------");
////        singlyLinkedList.deleteFirstNode();
////        singlyLinkedList.deleteLastNode();
////        int l= (int)singlyLinkedList.findMiddleNode();
//        singlyLinkedList.deleteMiddleNode();
//        singlyLinkedList.printLinkList();
//        int y= singlyLinkedList.getPosition(11);
//        System.out.println("position= "+y);
//        singlyLinkedList.matchedVaue(10);
//        System.out.println("---------------------------");
//        singlyLinkedList.printLinkList();
//
////        System.out.println("head="+singlyLinkedList.getHead().getData());
//        ImplementStackUsingLinkedList stack = new ImplementStackUsingLinkedList();
//        System.out.println("-----------------");
//        stack.Push(12);
//        stack.Push(13);
//        stack.Push(16);
//
//        stack.printStack();
//        System.out.println("pop ="+stack.Pop());
//        int top= stack.Top();
//        System.out.println("top="+top);
//        System.out.println("-----------------");
//        stack.printStack();
//        System.out.println("====================================");
////        ListNode listNode= traverseNthNodeFromEnd.EndTraverse(1);
////        if(listNode!=null) {
////            System.out.println(" nth node from end"+listNode.getData());
////        }
//////        else{
//////            System.out.println("null");
//////        }
////        singlyLinkedList.printLinkList();
////       ListNode listNode1= traverseNthNodeFromEnd.EndTraverse(4);
////        System.out.println("node="+listNode1.getData());
//        singlyLinkedList.printLinkList();
////        ListNode head = singlyLinkedList.getHead();
//        reverseSLList.reverseSLL();
//        System.out.println("-------------------------------------");
////        singlyLinkedList.setHead(head);
//        singlyLinkedList.printLinkList();
//        ---------------------------------------------------------------------------------------------------------------
//        System.out.println("Exchange Adjacent node =========================");
//        SinglyLinkedList exchangeAdjacentElementSinglyLinkedList = new SinglyLinkedList();
//        exchangeAdjacentElementSinglyLinkedList.insertAtBegin(15);
//        exchangeAdjacentElementSinglyLinkedList.insertAtBegin(2);
//        exchangeAdjacentElementSinglyLinkedList.insertAtBegin(3);
//        exchangeAdjacentElementSinglyLinkedList.insertAtBegin(4);
//        exchangeAdjacentElementSinglyLinkedList.insertAtBegin(5);
//        exchangeAdjacentElementSinglyLinkedList.insertAtBegin(6);
//        exchangeAdjacentElementSinglyLinkedList.insertAtBegin(7);
//        exchangeAdjacentElementSinglyLinkedList.insertAtBegin(8);
//        exchangeAdjacentElementSinglyLinkedList.insertAtBegin(9);
//        exchangeAdjacentElementSinglyLinkedList.insertAtBegin(10);
//        exchangeAdjacentElementSinglyLinkedList.insertAtBegin(11);
//        exchangeAdjacentElementSinglyLinkedList.insertAtBegin(12);
//        exchangeAdjacentElementSinglyLinkedList.insertAtBegin(13);
//        exchangeAdjacentElementSinglyLinkedList.insertAtBegin(14);

//        ExchangeAdjacentElement exchangeAdjacentElement= new ExchangeAdjacentElement(exchangeAdjacentElementSinglyLinkedList);
//        exchangeAdjacentElement.exchangeAdjacentNode();
//
//------------------------------------------------------------------------------------------------------
//        ListNode head= exchangeAdjacentElementSinglyLinkedList.getHead();
//    ReverseKNode reverseKNode= new ReverseKNode();
//        reverseKNode.reverseBlockOfKNode(head,3);
//        exchangeAdjacentElementSinglyLinkedList.printLinkList();

//------------------------------------------------------------------------------------------------------
//        Modular modular = new Modular(singlyLinkedList);
//        ListNode modularnodes= modular.modularNode(3);
//        System.out.println(modularnodes.getData());
//------------------------------------------------------------------------------------------------------
//
//        SplitEvenOddNode splitEvenOddNode =new SplitEvenOddNode(singlyLinkedList);
//        ListNode mergeList= splitEvenOddNode.spitAndMerge();
//        singlyLinkedList.setHead(mergeList);
//        singlyLinkedList.printLinkList();
//--------------------------------------------------------------------------------------------------------
//        RotateList rotateList= new RotateList(singlyLinkedList);
//        ListNode rotatedList=rotateList.rotateKNode(1);
//        singlyLinkedList.setHead(rotatedList);
//        singlyLinkedList.printLinkList();
//--------------------------------------------------------------------------------------------------------
        SinglyLinkedList list1= new SinglyLinkedList();
        SinglyLinkedList list2= new SinglyLinkedList();
        list1.insertAtEnd(9);
        list1.insertAtEnd(2);
        list2.insertAtEnd(5);
        list2.insertAtEnd(9);
        AdditionOfList additionOfList=new AdditionOfList(list1,list2);
        ListNode head = additionOfList.listAdd();
        singlyLinkedList.setHead(head);
        singlyLinkedList.printLinkList();

    }




}
