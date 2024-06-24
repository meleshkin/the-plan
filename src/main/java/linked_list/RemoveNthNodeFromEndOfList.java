package linked_list;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        /*
        list.addAtTail(1);
        list.addAtTail(2);
        list.addAtTail(3);
        list.addAtTail(4);
        list.addAtTail(5);

        MyLinkedList.Node res = removeNthFromEnd(list.head, 1);
         */

        list.addAtTail(1);
        list.addAtTail(2);
        MyLinkedList.Node res = removeNthFromEnd(list.head, 1);
    }

    public static MyLinkedList.Node removeNthFromEnd(MyLinkedList.Node head, int n) {
        int i = 0;
        MyLinkedList.Node fast = head;
        MyLinkedList.Node slow = null;

        while (fast != null) {
            fast = fast.next;
            if (i >= n) {
                if (slow == null) {
                    slow = head;
                } else {
                    slow = slow.next;
                }
            }
            i++;
        }
        if (slow == null) {
            head = head.next;
        } else {
            slow.next = slow.next.next;
        }
        return head;
    }


}
