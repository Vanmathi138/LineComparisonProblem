import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start with Displaying\n" +
                "Welcome to Line\n" +
                "Comparison Computation\n" +
                "Program on Master Branch");

        LineComparison.calculateLineLength();
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