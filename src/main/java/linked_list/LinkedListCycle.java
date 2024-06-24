package linked_list;

public class LinkedListCycle {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addAtTail(3);
        list.addAtTail(2);
        list.addAtTail(0);
        list.addAtTail(4);

        list.cycle(3);

        System.out.println(hasCycle(list.head));
        System.out.println();
    }

    public static boolean hasCycle(MyLinkedList.Node head) {

        MyLinkedList.Node slow = head;
        MyLinkedList.Node fast = head;

        int n = 0;
        while(slow != null && fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                if (n == 0) {
                    return false;
                } else {
                    fast = null;
                }
            }
            if (slow == fast) {
                return true;
            }
            n++;
        }

        return false;
    }
}
