import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start with Displaying\n" +
                "Welcome to Line\n" +
                "Comparison Computation\n" +
                "Program on Master Branch");

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Use cases of Line Comparison are: ");
        System.out.println("1. Use case1 : Calculate Line Length");

        System.out.print("Enter the use case: ");
        int useCase = scanner.nextInt();

        switch (useCase){
            case 1:
                calculateLength();
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
    public static void calculateLength(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter coordinates for the first point");
        System.out.print("x1: ");
        int x1 = scan.nextInt();
        System.out.print("x2: ");
        int x2 = scan.nextInt();

        System.out.println("Enter coordinates for the second point");
        System.out.print("y1: ");
        int y1 = scan.nextInt();
        System.out.print("y2: ");
        int y2 = scan.nextInt();

        double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.printf("Length of the line: %.2f%n", length);
    }
}

