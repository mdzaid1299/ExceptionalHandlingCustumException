import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = scanner.nextInt();
        System.out.println("enter num2");
        int num2 = scanner.nextInt();
        int sum = 0;
        try {
            sum = num1 + num2;
            if (sum < 150) {
                throw new MyFirstException("Custom exception occurs because the sum must be greater then 150");
            }

            System.out.println("result = " + sum);
        } catch (MyFirstException e) {
            System.err.println("e = " + e);
        }

    }
}