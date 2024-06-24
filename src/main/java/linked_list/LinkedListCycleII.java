package linked_list;

public class LinkedListCycleII {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addAtTail(3);
        list.addAtTail(2);
        list.addAtTail(0);
        list.addAtTail(4);

        list.cycle(1);

        System.out.println(hasCycle(list.head));
        System.out.println();
    }

    public static int hasCycle(MyLinkedList.Node head) {

        MyLinkedList.Node slow = head;
        MyLinkedList.Node fast = head;

        int slowCnt = 0;
        int fastCnt = 0;
        int n = 0;
        while(slow != null && fast != null) {
            slow = slow.next;
            slowCnt++;
            if (fast.next != null) {
                fast = fast.next.next;
                fastCnt+=2;
            } else {
                return -1;
            }
            if (slow == fast) {
                return ++n;
            }
            n++;
        }

        return -1;
    }
}

