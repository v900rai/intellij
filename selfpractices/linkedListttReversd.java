package selfpractices;



public class linkedListttReversd {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            data = data;
            next = null;

        }

    }

    /* Function to reverse the linked list */
    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;


    }
}
