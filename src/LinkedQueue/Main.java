package LinkedQueue;

public class Main {

    public static void main(String[] args) {
        LinkedQueue<String> St = new LinkedQueue<String>();
        St.enqueue("somaalia");
        St.enqueue("Uganda");
        St.enqueue("Germany");
        St.enqueue("England");
        St.enqueue("America");
        St.enqueue("Ethopia");
        St.enqueue("Kenya");

        St.PrintQueue();
        System.out.println("first " + St.first());
        System.out.println("Dequeue " +  St.dequeue());
        System.out.println("Size " + St.Size());
        System.out.println("isEmpty " + St.isEmpty());
        System.out.println("first " + St.first());

        St.PrintQueue();

    }


}
