import java.util.*;
public class Fibonacci{
    public static void main(String[] args) {
        int num =Input("Enter the number: ");
        generateSequence(num);
    }

    private static int Input(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        while (!sc.hasNextInt()) {
            System.out.print("Please enter a positive integer: ");
            sc.next();
        }
        int input = sc.nextInt();
        return input > 0 ? input :Input("Please enter a positive integer: ");
    }

    private static void generateSequence(int num) {
        int first = 0, second = 1;
        System.out.println("Fibonacci sequence up to " + num + " terms:");

        for (int i = 1; i <= num; i++) {
            System.out.print(first + " ");
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
        System.out.println();
    }
}

