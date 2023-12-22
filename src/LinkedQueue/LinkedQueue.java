package LinkedQueue;

import java.util.EmptyStackException;

public class LinkedQueue<T>{

    //
    private int counter;

    // head have front element

//    this one is object reference variable
    private Node<T> head;

    // tail have rear element
    private Node<T> tail;

    LinkedQueue(){
        head = tail = null;
        counter = 0;
    }

    // operations

    // enqueue
    void enqueue (T element){
        Node<T> temp = new Node<T>(element);
        if(isEmpty())
            head = temp;
        else
            tail.setNext(temp);
        tail = temp;
        counter ++;
    }

// isEmpty

    boolean isEmpty(){
        return  counter == 0;
    }
    //size

    int Size(){
        return counter;
    }
    // Dequeue
    T dequeue () throws EmptyStackException {
        if(isEmpty())
            throw new EmptyStackException();
        T removedElement = head.getElement();

        head = head.getNext();
        counter --;
        if(isEmpty())
            tail = null;
        return  removedElement;
    }
    // first
    T first () throws  EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        return head.getElement();
    }
    // printQueue
    void PrintQueue(){
        if(isEmpty())
            System.out.println("the queue is empty");
        else{
            System.out.print("[");
            Node<T> current = head;
            while(current != null){

                System.out.print(current.getElement() + ",");
                current = current.getNext();
            }
            System.out.println("]");
        }
    }
}
