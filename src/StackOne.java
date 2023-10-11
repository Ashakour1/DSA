import java.util.Stack;

public class StackOne {
    public static void main(String[] args) {

        Stack<Integer> Stack1 = new Stack<>();

        //ading numbers
        Stack1.push(10);
        Stack1.push(111);
        System.out.println(Stack1);
        // delete
        Stack1.pop();
        System.out.println(Stack1);
        // top
        Stack1.peek();

        System.out.println(Stack1);
        // empty

        System.out.println( "empty stack is " + Stack1.isEmpty());
        // size

        System.out.println("Stack size is " + Stack1.size());

    }
}
