package linked_list;

public class RotateList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtTail(0);
        list.addAtTail(1);
        list.addAtTail(2);

        /*
        list.addAtTail(3);
        list.addAtTail(4);
        list.addAtTail(5);

         */

        rotateRight(list.head, 4);
    }
    public static MyLinkedList.Node rotateRight(MyLinkedList.Node head, int k) {
        if (k < 1) {
            return head;
        }

        if (head == null || head.next == null) {
            return head;
        }

        int length = getLength(head);
        if (k >= length) {
            k = k  % length;
        }

        int i = 0;
        while (i < k) {
            rotate1(head);
            i++;
        }
        return head;
    }

    public static int getLength(MyLinkedList.Node head) {
        if (head == null) return 0;
        if (head.next == null) return 1;

        MyLinkedList.Node curr = head;
        int i = 0;
        while(curr != null) {
            curr = curr.next;
            i++;
        }
        return i;
    }

    public static void rotate1(MyLinkedList.Node head) {
        if (head == null || head.next == null) {
            return;
        }

        int prevVal = head.val;
        MyLinkedList.Node curr = head.next;
        while (curr != null) {
            int tmp = curr.val;
            curr.val = prevVal;
            prevVal = tmp;
            curr = curr.next;
        }
        head.val = prevVal;
    }
}
