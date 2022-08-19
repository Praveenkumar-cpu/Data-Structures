package bridgelab;

public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList();
        list1.push(70);
        list1.push(30);
        list1.push(56);
        list1.show();

        System.out.println();

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(56);
        list2.add(30);
        list2.add(70);
        list2.show();

    }
}
