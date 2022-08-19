package bridgelab;
public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void push(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

    }

    public void add(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void apendNode(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }


    public void show() {
        if (head == null) {
            System.out.println("Linked list Empty");
        } else {
            Node<T> temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public void insertMid(int pos, T data) {
        Node<T> newNode = new Node(data);

        Node<T> current = this.head;
        Node<T> previous = this.head;
        while (current.next != null && pos > 0) {

            previous = current;
            current = current.next;
        }
        previous.next = newNode;
        newNode.next = current;
    }

    public T popAtFirst() {
        System.out.println("After deleting first element");
        T temp;
        if (head == null) {
            System.out.println("Stack Over Flow");
        }
        temp = head.data;
        head = head.next;
        return temp;
    }
    public int popAtLast() {
        System.out.println("Deleting last element of data from the list");
        if (head == null) {
            System.out.println("Empty LinkedList");
        } else {
            Node current = head;
            Node previous = head;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
        }
        return 0;
    }
}