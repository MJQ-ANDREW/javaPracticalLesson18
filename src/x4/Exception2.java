package x4;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2.0 / i);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer.");
            if (true) return;
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero.");
        } finally {
            System.out.println("This is the finally block.");
        }
    }

    public static void main(String[] args) {
        Exception2 demo = new Exception2();
        demo.exceptionDemo();
    }
}
