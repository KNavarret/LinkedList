import java.util.StringJoiner;

public class SinglyLinkedList <E> implements LinkedList <E> {

    private Node head;
    private Node tail;

    public SinglyLinkedList(){
        head = null;
        tail = null;
    }

    @Override
    public void addFirst(E element) {
        Node node = new Node(element, head);

        if(head == null){
            head = node;
            tail = head; //or = node

        }
        else{
            head = node;
        }
    }

    @Override
    public void addLast(E element) {
        Node node = new Node(element, null);

        if(tail == null){
            tail = node;
            head = tail;
        }
        else {
            tail.next = node;
            tail = node;
        }
        //tail.next = node;
        //tail = node;

    }

    @Override
    public E pollFirst() {
        E element;
        if(head == null){
            element = null;

        }
        else {
            element = head.element;

            Node next = head.next;
            head.next = null;
            head = next;
        }


    }

    @Override
    public E pollLast() {
        E element;
        if (tail == null){
            element = tail.element;
        }
        else{
            element = tail.element;

            if (head == tail){
                head = null;
                tail = null;
            }
            else{
                Node current = head;
                Node previous = head;
                while(current.next != null){
                    previous = current;
                    current = current.next;

                }
                tail = previous;
                tail.next = null;
            }
        }
        return element;
    }

    @Override
    public E peekFirst() {
        return head.element;
    }

    @Override
    public E peekLast() {
        return tail.element;
    }

    @Override
    public void clear() {
        Node current = head;
        while (current.next != null){
            Node next = current.next;
            current.next = null;
            current = next;
        }

        head = null;
        tail = null;
    }

    @Override
    public boolean contains(E elements) {
        boolean contains = false;
        Node current = head;
        while (current != null){
            Node next = current.next;
            if(current.element == elements){
                contains = true;
                break;
            }
            current = next;

        }
        return contains;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder("[");
        StringJoiner joiner = new StringJoiner(", ");
        Node current = head;

        if(current != null){
            while(current != null){
                joiner.add(current.element.toString());
                current = current.next;
            }
        }

        builder.append(joiner);
        builder.append("]");
        return builder.toString();
    }

    private class Node {

        Node next;
        E element;

        public Node(E element, Node next){
            this.element = element;
            this.next = next;

        }
    }
}
