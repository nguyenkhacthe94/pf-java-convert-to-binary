import java.util.Scanner;
import java.util.Stack;

public class ConvertToBinary {
    public static void main(String[] args) {

        Stack stack = new Stack();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integer number to convert: ");
        int number = input.nextInt();
        do {
            stack.push(number % 2);
            number = (int) number / 2;
        } while (number > 1);
        stack.push(number);
        System.out.println("Converted to binary: ");
        while (!stack.isEmpty()) {
            System.out.printf("%s", stack.pop());
        }
    }
}
