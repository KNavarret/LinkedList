public class SingleDriver {

    public static void main(String[] args){
        LinkedList<String> linkedlist = new SinglyLinkedList<>();

        LinkedList.addFirst("first");
        LinkedList.addFirst("second");
        LinkedList.addFirst("third");
        LinkedList.addFirst("fourth");
        LinkedList.addFirst("fifth");

        LinkedList.addFirst("sixth");
        LinkedList.addFirst("seventh");
        LinkedList.addFirst("eighth");

        boolean contains = linkedlist.contains("first");
        boolean contains = linkedlist.contains("eighth");
        boolean contains = linkedlist.contains("tenth");

        System.out.println(Linkedlist.peekFirst());
        System.out.println(Linkedlist.peekLast());
        System.out.println();




        linkedlist.pollFirst();
         System.out.println(linkedList);

        linkedlist.pollLast();
        System.out.println(linkedList);

        linkedlist.clear();
        System.out.println(linkedList);


    }
}
