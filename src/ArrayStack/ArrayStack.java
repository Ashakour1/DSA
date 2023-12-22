package ArrayStack;

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

        array1.push(12);
        array1.push(12);
        array1.push(122);
        array1.push(12);

        System.out.println(array1.PrintElements());


        ArrayStack<Integer> Array2 = new ArrayStack<>();
        Array2.push(33);
        Array2.push(12);
        Array2.push(12);
        Array2.push(12);

        System.out.println(Array2.PrintElements());

        ArrayStack<Integer> Result = new ArrayStack<>();

        if(array1.Size() == Array2.Size()){
            int size = array1.Size();
            for(int i = 0;i <size; i++){
                Result.push(array1.pop() + Array2.pop());


            }

        }else{
            System.out.println("result is not same shit");




        }

        System.out.println("result is " +  Result.PrintElements());




    }

    public StringBuffer PrintElements() {
        StringBuffer  Sb = new StringBuffer();


        for(int i = top - 1; i >= 0 ; i --){
            Sb.append(Stack[i]);
            if(i > 0){
                Sb.append(",");
            }

        }

        return  Sb;


    }
}
