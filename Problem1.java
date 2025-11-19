import java.util.Scanner;
public class Problem1 {

    public static double forAddition(double a, double b) {
        return a + b;
    }

    public static double forSubtraction(double a, double b) {
        return a - b;
    }

    public static double forMultiplication(double a, double b) {
        return a * b;
    }

    public static double forDivision(double a, double b) {
    	 	if (b == 0) {
             throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the a Value: ");
        double a = sc.nextDouble();

        System.out.print("Enter the b Value: ");
        double b = sc.nextDouble();

        System.out.println("Enter the type of operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Addition Of " +a+ " and " +b+ " is "+forAddition(a, b));
                break;
            case 2:
                System.out.println("Substraction Of " +a+ " and " +b+ " is "+forSubtraction(a, b));
                break;
            case 3:
                System.out.println("Multiplication Of " +a+ " and " +b+ " is "+forMultiplication(a, b));
                break;
            case 4:
            		System.out.println("Division Of " +a+ " and " +b+ " is "+forDivision(a, b));
                break;
            default:
                System.out.println("Enter only the given operations!");
        }
        sc.close();
    }
}