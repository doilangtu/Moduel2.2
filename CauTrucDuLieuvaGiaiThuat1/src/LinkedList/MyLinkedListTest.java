package LinkedList;
import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list;
        list = new MyLinkedList();
        System.out.println("-----------------");
        list.addFirst(3);
        list.add(0,1);
        list.add(1,3);
        list.add(2,4);
        list.add(3,5);
        list.add(4,6);

        list.addLast(7);
        list.printList();
        System.out.println("======");
        System.out.println("xoa phan tu: "+list.remove(2));
        list.printList();
        System.out.println("-------------");

    }
}
