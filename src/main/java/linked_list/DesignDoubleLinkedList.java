package linked_list;

public class DesignDoubleLinkedList {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        /*
        list.addAtHead(1);
        list.addAtHead(2);
        list.addAtHead(3);
        list.addAtHead(4);
        */

        /*
        list.addAtTail(1);
        list.addAtTail(2);
        list.addAtTail(3);
        list.addAtTail(4);
        */

        list.addAtIndex(0, 1);
        list.addAtIndex(1, 2);
        list.addAtIndex(2, 3);
        list.addAtIndex(3, 4);

        list.deleteAtIndex(3);

        System.out.println(list.get(4));
    }
}

class Node {
    int val;
    Node next;
    Node prev;

    public Node(int val) {
        this.val = val;
    }
}

class DoubleLinkedList {

    Node head;
    public DoubleLinkedList() {
        head = null;
    }

    public int get(int index) {
        if (index < 0) {
            return -1;
        }
        int n = 0;
        Node curr = head;
        while (curr != null) {
            if (n == index) {
                return curr.val;
            } else {
                n++;
                curr = curr.next;
            }
        }
        return -1;
    }

    public void addAtHead(int val) {
        if (head == null) {
            Node node = new Node(val);
            head = node;
        } else {
            Node node = new Node(val);
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    public void addAtTail(int val) {
        Node curr = head;
        if (head == null) {
            addAtHead(val);
        } else {
            while (curr.next != null) {
                curr = curr.next;
            }
            Node node = new Node(val);
            node.prev = curr;
            curr.next = node;
        }
    }

    public void addAtIndex(int index, int val) {
        if (index < 0) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
        }
        int n = 0;
        Node curr = head;
        while (curr != null) {
            if (n == index - 1) {
                Node newNode = new Node(val);
                newNode.next = curr.next;
                curr.next = newNode;
                newNode.prev = curr;
            } else {
                curr = curr.next;
            }
            n++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0) {
            return;
        }
        if (index == 0) {
            head = head.next;
        }
        int n = 0;
        Node curr = head;
        while (curr != null) {
            if (n == index - 1) {
                if (curr.next != null) {
                    curr.next = curr.next.next;
                    if (curr.next != null) {
                        curr.next.prev = curr;
                    }
                }
            } else {
                curr = curr.next;
            }
            n++;
        }
    }
}
