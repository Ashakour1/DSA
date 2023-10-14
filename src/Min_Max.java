import java.util.Scanner;
import java.util.Stack;

public class Min_Max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers");

        String numbersInput = input.nextLine();

        String[] numbersArray = numbersInput.split(" ");

        int[] inputNumbers = new int[numbersArray.length];

        for (int i = 0; i < numbersArray.length; i++) {
            inputNumbers[i] = Integer.parseInt(numbersArray[i]);
        }

        int[] result = max_min(inputNumbers);
        System.out.println("Minimum value: " + result[0]);
        System.out.println("Maximum value: " + result[1]);
    }

    public static int[] max_min(int[] input) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < input.length; i++) {
            stack.push(input[i]);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (!stack.isEmpty()) {
            int num = stack.pop();

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }


        }

        return new int[]{min, max};
    }
}