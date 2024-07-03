package linked_list;

public class AddTwoNumbers {
    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList();
        /*
        list1.addAtTail(9);
        list1.addAtTail(9);
        list1.addAtTail(9);
        list1.addAtTail(9);
        list1.addAtTail(9);
        list1.addAtTail(9);
        list1.addAtTail(9);

         */

        MyLinkedList list2 = new MyLinkedList();
        /*
        list2.addAtTail(9);
        list2.addAtTail(9);
        list2.addAtTail(9);
        list2.addAtTail(9);

         */

        MyLinkedList.Node n = addTwoNumbers(list1.head, list2.head);
    }

    public static MyLinkedList.Node addTwoNumbers(MyLinkedList.Node list1, MyLinkedList.Node list2) {
        MyLinkedList.Node curr1 = list1;
        MyLinkedList.Node curr2 = list2;
        int carry = 0;
        int val1 = 0;
        int val2 = 0;
        int sum = 0;

        MyLinkedList.Node head = new MyLinkedList.Node(777);
        MyLinkedList.Node tail = head;

        while (curr1 != null || curr2 != null) {
            if (curr1 == null) {
                val1 = 0;
            } else {
                val1 = curr1.val;
                curr1 = curr1.next;
            }

            if (curr2 == null) {
                val2 = 0;
            } else {
                val2 = curr2.val;
                curr2 = curr2.next;
            }

            sum = val1 + val2 + carry;
            if (sum >= 10) {
                sum = sum-10;
                carry = 1;
            } else {
                carry = 0;
            }

            MyLinkedList.Node newNode = new MyLinkedList.Node(sum);
            tail.next = newNode;
            tail = newNode;
        }

        if(carry == 1) {
            MyLinkedList.Node newNode = new MyLinkedList.Node(1);
            tail.next = newNode;
        }
        return head.next;
    }
}
