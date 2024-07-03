package linked_list;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList();
        //list1.addAtTail(1);
        //list1.addAtTail(2);
        //list1.addAtTail(4);

        MyLinkedList list2 = new MyLinkedList();
        list2.addAtTail(1);
        //list2.addAtTail(3);
        //list2.addAtTail(4);
        //list2.addAtTail(5);
        //list2.addAtTail(14);

        MyLinkedList.Node n = mergeTwoLists(list1.head, list2.head);
        System.out.println(n);
    }

    public static MyLinkedList.Node mergeTwoLists(MyLinkedList.Node list1, MyLinkedList.Node list2) {

        MyLinkedList.Node curr1 = list1;
        MyLinkedList.Node curr2 = list2;

        MyLinkedList.Node head = new MyLinkedList.Node(777);
        MyLinkedList.Node tail = head;


        while (curr1 != null && curr2 != null) {
            if (curr1.val <= curr2.val) {
                tail.next = curr1;
                tail = curr1;
                curr1 = curr1.next;
            } else {
                tail.next = curr2;
                tail = curr2;
                curr2 = curr2.next;
            }
        }

        while (curr1 != null) {
            tail.next = curr1;
            tail = curr1;
            curr1 = curr1.next;
        }

        while (curr2 != null) {
            tail.next = curr2;
            tail = curr2;
            curr2 = curr2.next;
        }

        return head.next;
    }
}

