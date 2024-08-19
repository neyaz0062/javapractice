package ds;

public class DoublyLinMain {
    public static void main(String[] args) {

        DoublyLinList list = new DoublyLinList();
        list.addAtStart(1);
        list.addAtStart(2);
        list.addAtStart(3);
        list.addAtStart(4);
        list.addAtStart(5);

        list.display();
        System.out.println();
        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.display();
        System.out.println();


        list.addAtIndex(9, 100);
        list.display();

    }
}
