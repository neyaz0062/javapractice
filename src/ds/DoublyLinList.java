package ds;

public class DoublyLinList {

    Node head;
    Node tail;

    public void addAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = null;
            newNode.prev = null;
            head = newNode;
            tail = newNode;

        }
        else {

           newNode.next = head;
           newNode.prev = null;
           head = newNode;

        }
    }
    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = null;
            newNode.prev = null;
            head = newNode;
            tail = newNode;

        }
        else {
            Node temp=head;
            for (; temp.next != null; temp = temp.next);

            newNode.next = null;
            temp.next = newNode;
            newNode.prev = temp;
            tail = newNode;
        }
    }

    public void addAtIndex(int index, int data) {
        Node newNode = new Node(data);
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        if (head == null) {
            // Handle the case where the list is empty
            if (index != 0) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            newNode.next = null;
            newNode.prev = null;
            head = newNode;
            tail = newNode;

        }
        else {
            // Insert at the beginning
            if (index == 0) {
                newNode.next = head;
                newNode.prev = null;
                head.prev = newNode;
                head = newNode;
                return;
            }

            Node temp1 = head;

            // Traverse to the node just before the insertion point
            for (int i = 0; i < index - 1; i++) {
                if (temp1.next == null) {
                    throw new IndexOutOfBoundsException("Index out of bounds");
                }
                temp1 = temp1.next;
            }
            Node temp2 = temp1.next;
            // Insert at the end
            if (temp2 == null) {
                temp1.next = newNode;
                newNode.prev = temp1;
                tail = newNode; // Update tail
            }
            else {
                // Insert in the middle
                temp1.next = newNode;
                newNode.prev = temp1;
                newNode.next = temp2;
                temp2.prev = newNode;
            }

        }
    }
    public void display() {

        for (Node temp = head; temp!= null ; temp = temp.next) {
            System.out.print(temp.value+" ");

        }
    }
}
