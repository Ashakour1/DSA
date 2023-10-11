import java.util.Scanner;
import java.util.Stack;

public class Reverse2 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("enter everything u want");
        String input = Input.nextLine();

        System.out.println(reverse(input));

    }

    public static String reverse(String input){

        Stack<Character> stack = new Stack<>();

        for(char i:input.toCharArray()){

            if(!stack.contains(i)){
                stack.push(i);
            }

        }

        StringBuffer reversed = new StringBuffer();

        while (!stack.isEmpty()){

            char currentChar = stack.pop();

                reversed.append(currentChar);
            }
        return  reversed.toString();
    }


}
