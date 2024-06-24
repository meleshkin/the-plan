package linked_list;

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList();
        MyLinkedList list2 = new MyLinkedList();

        /*
        list1.addAtTail(4);
        list1.addAtTail(1);
        list1.addAtTail(8);
        list1.addAtTail(4);
        list1.addAtTail(5);

        list2.addAtTail(5);
        list2.addAtTail(6);
        list2.addAtTail(1);

        MyLinkedList.Node last2 = list2.getLast();
        MyLinkedList.Node intersec = list1.getNode(2);
        last2.next = intersec;
         */

        list1.addAtTail(1);
        list1.addAtTail(9);
        list1.addAtTail(1);
        list1.addAtTail(2);
        list1.addAtTail(4);

        list2.addAtTail(3);
        MyLinkedList.Node last2 = list2.getLast();
        MyLinkedList.Node intersec = list1.getNode(3);
        last2.next = intersec;




        getIntersectionNode(list1.head, list2.head);

        System.out.println();
    }

    public static MyLinkedList.Node getIntersectionNode(MyLinkedList.Node headA, MyLinkedList.Node headB) {
        int length1 = 0;
        int length2 = 0;
        MyLinkedList.Node curr1 = headA;
        MyLinkedList.Node curr2 = headB;

        while(curr1.next != null) {
            curr1 = curr1.next;
            length1++;
        }
        length1++;

        while(curr2.next != null) {
            curr2 = curr2.next;
            length2++;
        }
        length2++;

        if (curr1 != curr2) {
            return null;
        }

        if (length2 > length1) {
            int n = length2-length1;
            curr1 = headA;
            curr2 = headB;

            int m=0;
            while (m<n) {
                curr2 = curr2.next;
                m++;
            }

            while(curr1 != curr2) {
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
            return curr1;



        } else if (length2 < length1) {
            int n = length1-length2;
            curr1 = headA;
            curr2 = headB;

            int m=0;
            while (m<n) {
                curr1 = curr1.next;
                m++;
            }

            while(curr1 != curr2) {
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
            return curr1;
        } else {
            curr1 = headA;
            curr2 = headB;
            while(curr1 != curr2) {
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
            return curr1;

        }
    }
}
