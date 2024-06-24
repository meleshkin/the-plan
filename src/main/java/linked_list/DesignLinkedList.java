package linked_list;

public class DesignLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        /*
        list.addAtHead(0);
        list.addAtHead(1);
        list.addAtHead(2);
        list.addAtHead(3);
         */
        /*
        list.addAtTail(0);
        list.addAtTail(1);
        list.addAtTail(2);
        list.addAtTail(3);
        list.addAtTail(4);

        list.deleteAtIndex(40);
        */


        myLinkedList.addAtHead(2);
        myLinkedList.deleteAtIndex(1);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(7);
        myLinkedList.addAtHead(3);

        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(5);

        myLinkedList.addAtTail(5);
        myLinkedList.get(5);
        myLinkedList.deleteAtIndex(6);
        myLinkedList.deleteAtIndex(4);



        System.out.println();
    }
}
