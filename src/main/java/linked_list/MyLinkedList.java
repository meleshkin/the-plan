package linked_list;

public class MyLinkedList {

    class Node {
        int val;
        Node next;

        public Node() { }

        public Node(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }
    Node head;

    public MyLinkedList() {
        head = null;
    }

    public void cycle(int indexTo) {
        Node last;
        Node target = null;

        int n = 0;
        Node curr = head;
        while (curr != null) {
            if (n == indexTo) {
                target = curr;
                break;
            } else {
                curr = curr.next;
            }
            n++;
        }

        curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        last = curr;

        last.next = target;

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
                curr = curr.next;
            }
            n++;
        }
        return -1;
    }

    public Node getNode(int index) {
        if (index < 0) {
            return null;
        }
        int n = 0;
        Node curr = head;
        while (curr != null) {
            if (n == index) {
                return curr;
            } else {
                curr = curr.next;
            }
            n++;
        }
        return null;
    }

    public void addAtHead(int val) {
        if (head == null) {
            head = new Node(val);
        } else {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
        }
    }

    public void addAtTail(int val) {
        if (head == null) {
            head = new Node(val);
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new Node(val);
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
                }
            } else {
                curr = curr.next;
            }
            n++;
        }
    }

    public Node getLast() {
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        return curr;
    }
}
