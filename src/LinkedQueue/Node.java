package LinkedQueue;

public class Node<T>{

    // data
    private T element;
    // address ayuu heyn doona
    private Node<T> next;


    Node(T element){
        this.element = element;
        next = null;
    }

    // properties

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

}
