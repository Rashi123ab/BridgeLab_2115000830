import java.util.*;
public class MaxOf3{
    public static void main(String[] args) {
        int num1 =Input("Enter the first number: ");
        int num2 =Input("Enter the second number: ");
        int num3 =Input("Enter the third number: ");

        int max =Max(num1, num2, num3);

        System.out.println("The maximum of the three numbers is: " + max);
    }
    private static int Input(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        while (!sc.hasNextInt()) {
            System.out.print("Please enter an integer: ");
            sc.next();
        }
        return sc.nextInt();
    }

    private static int Max(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
}

