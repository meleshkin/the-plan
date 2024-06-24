package linked_list;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtTail(2);



        isPalindrome(list.head);
    }

    public static boolean isPalindrome(MyLinkedList.Node head) {
        if (head.next == null) {
            return true;
        }

        int n = 0;
        MyLinkedList.Node curr = head;
        while (curr != null) {
            curr = curr.next;
            n++;
        }
        int  lim = n / 2;
        boolean odd = (n % 2 == 0);


        int m = 1;
        curr = head;
        while (m < lim) {
            curr = curr.next;
            m++;
        }

        MyLinkedList.Node head2;
        if (odd) {
            head2 = curr.next;
        } else {
            head2 = curr.next.next;
        }
        curr.next = null;

        head = reverse(head);

        MyLinkedList.Node p1 = head;
        MyLinkedList.Node p2 = head2;
        while (p1 != null && p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;

        }

        return true;
    }

    public static MyLinkedList.Node reverse(MyLinkedList.Node head) {

        MyLinkedList.Node curr = head;
        MyLinkedList.Node prev = null;
        MyLinkedList.Node tmp;

        while (curr != null) {
            tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }

        return prev;
    }

}
