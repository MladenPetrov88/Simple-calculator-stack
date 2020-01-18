import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpeCalculatorStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        if (input.length == 0) {
            return;
        }

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(Integer.parseInt(input[0]));

        for (int i = 1; i < input.length; i++) {
            String operation = input[i];
            int number = Integer.parseInt(input[++i]);
            int stackNum =  stack.pop();

            if (operation.equals("+")) {
                stack.push(number + stackNum);
            } else {
                stack.push(stackNum - number);
            }
        }

        System.out.println(stack.peek());
    }
}
