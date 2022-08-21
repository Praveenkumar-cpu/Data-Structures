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

    public boolean searchNode(T x) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(x))
                current = current.next;
            return true;
        }
        return false;

    }

    public void deleteAnyNode(T data) {
        System.out.println("deleting node with the value"+ " "+data +  "    ");
        Node cur = head;
        Node prev = head;

        while (cur != null && cur.data != data){
            prev = cur;
            cur = cur.next;
        }
            if(cur !=null){
                prev.next = cur.next;
            }else {
                System.out.println("value"+ data + "Not found");
            }
    }

    public void sortInAsceding() {
        Node cur = head, index = null;
        int temp;
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            while (cur != null) {
                index = cur.next;
                while (index != null) {
                    if (cur.data.hashCode()>index.data.hashCode()) {
                        temp = cur.data.hashCode();
                        cur.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                cur = cur.next;
            }
        }
    }


}




