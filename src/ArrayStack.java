import java.util.Arrays;

public class ArrayStack<T> {
    private final static int Def_size = 2;
    private int top;
    private T[] Stack;

    ArrayStack(){
        this(Def_size);
    };

    ArrayStack(int size){
        top = 0;
        Stack =(T[]) (new Object[size]);
    };


    public void push(T element){
        if(Size()==Stack.length);
        expandCapacity();

        Stack[top] = element;
        top++;

    }

    public void expandCapacity(){
        Stack = Arrays.copyOf(Stack, Stack.length * 2);
    }
    public int Size(){
        return top;
    }

    public boolean IsEmpty(){
        return  top == 0;
    }

    public T pop(){
        if (IsEmpty()){
            System.out.println("stack is empty");
        }
        top --;
        T result = Stack[top];
        Stack[top] = null;
        return  result;
    }

    public T peek() {
        if(IsEmpty()){
            System.out.println("nothing more inside this array stack");
        }
         return  Stack[top-1];
    }

    public static void main(String[] args) {
        ArrayStack<Integer> array1 = new ArrayStack<>();
        array1.push(111);
        array1.push(111);
        array1.push(111);
        array1.push(22);
        array1.push(44);


       array1.PrintElements();

    }

    public void PrintElements() {
        StringBuilder  Sb = new  StringBuilder();

        for(int i = top - 1; i >= 0 ; i --){
            Sb.append(Stack[i]);
            if(i > 0){
                Sb.append(",");
            }
        }

        System.out.println(Sb.toString());

    }
}
