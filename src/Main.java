import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start with Displaying\n" +
                "Welcome to Line\n" +
                "Comparison Computation\n" +
                "Program on Master Branch");

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Use cases of Line Comparison are: ");
        System.out.println("1. Use case1 : Calculate Line Length");
        System.out.print("Enter the use case: ");
        int useCase = scanner.nextInt();

        switch (useCase) {
            case 1:
                LineComparison.calculateLineLength();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
class LineComparison{

    public static void  calculateLineLength(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates for the first point:");
        System.out.print("x1 = ");
        int x1 = scanner.nextInt();
        System.out.print("y1 = ");
        int y1 = scanner.nextInt();

        System.out.println("Enter coordinates for the second point:");
        System.out.print("x2 = ");
        int x2 = scanner.nextInt();
        System.out.print("y2 = ");
        int y2 = scanner.nextInt();

        double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.printf("Length of the line: %.2f",length);
    }
}