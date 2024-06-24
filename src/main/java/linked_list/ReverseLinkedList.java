package linked_list;

public class ReverseLinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addAtTail(1);
        //list.addAtTail(2);

        reverseList(list.head);
    }

    public static MyLinkedList.Node reverseList(MyLinkedList.Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        MyLinkedList.Node curr = head;
        MyLinkedList.Node newHead = null;
        MyLinkedList.Node tmp;

        while (curr != null) {
            tmp = curr.next;
            curr.next = newHead;;
            newHead = curr;
            curr = tmp;
        }
        return newHead;
    }
}
