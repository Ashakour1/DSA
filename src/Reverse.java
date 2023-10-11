import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("enter everything u want");
        String input = Input.nextLine();
        System.out.println(reverse(input));
    }

    public static String reverse(String input){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i< input.length(); i++){
            stack.push(input.charAt(i));
        }
        //pop elements

        String Reversed = "";
        while (!stack.isEmpty()){
            Reversed += stack.pop();
        }

        return  Reversed;
    }
}
