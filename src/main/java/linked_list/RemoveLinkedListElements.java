package linked_list;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        //list.addAtTail(6);
        list.addAtTail(6);
        /*
        list.addAtTail(2);
        list.addAtTail(6);
        list.addAtTail(6);
        list.addAtTail(3);
        list.addAtTail(4);
        list.addAtTail(6);
        list.addAtTail(6);
        */
        removeElements(list.head, 6);

    }

    public static MyLinkedList.Node removeElements(MyLinkedList.Node head, int val) {
        if (head == null) {
            return null;
        }

        MyLinkedList.Node curr = head;
        MyLinkedList.Node prev = null;

        while (curr != null) {
            if (curr.val == val) {
                if (prev == null) {
                    head = curr.next;
                } else {
                    prev.next = curr.next;
                }
            } else {
                prev = curr;
            }
            curr = curr.next;
        }

        return head;
    }
}
