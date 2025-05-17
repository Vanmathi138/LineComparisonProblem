import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start with Displaying\n" +
                "Welcome to Line\n" +
                "Comparison Computation\n" +
                "Program on Master Branch");

        while (true) {
            System.out.println("\nUse cases of Line Comparison are: ");
            System.out.println("1. Use case1 : Calculate Line Length");
            System.out.println("2. Use case2 : Check the Equality of 2 lines");
            System.out.println("3. Use case3: Compare two lines");
            System.out.println("4. Exit");

            System.out.print("Enter the use case: ");
            int useCase = scanner.nextInt();

            switch (useCase) {
                case 1:
                    calculateLength();
                    break;
                case 2:
                    checkEqualityOfTwoLines();
                    break;
                case 3:
                    compareTwoLines();
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    return; // ends the main method
                default:
                    System.out.println("Invalid option. Please enter 1, 2, or 3.");
            }
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
    public static void checkEqualityOfTwoLines(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the coordinates of first line");
        System.out.print("x1: ");
        int x1 = scan.nextInt();
        System.out.print("x2: ");
        int x2 = scan.nextInt();
        System.out.print("y1: ");
        int y1 = scan.nextInt();
        System.out.print("y2: ");
        int y2 = scan.nextInt();

        System.out.println("Enter the coordinates of second line");
        System.out.print("a1: ");
        int a1 = scan.nextInt();
        System.out.print("a2: ");
        int a2 = scan.nextInt();
        System.out.print("b1: ");
        int b1 = scan.nextInt();
        System.out.print("b2: ");
        int b2 = scan.nextInt();

        Double length1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        Double length2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));

        System.out.printf("Length of Line 1: %.2f\n",length1);
        System.out.printf("Length of Line 2: %.2f\n",length2);

        if(length1.equals(length2)){
            System.out.println("Both lines are Equal");
        }else {
            System.out.println("Both lines are not equal");
        }
    }
    private static void compareTwoLines() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the coordinates of first line");
        System.out.print("x1: ");
        int x1 = scan.nextInt();
        System.out.print("x2: ");
        int x2 = scan.nextInt();
        System.out.print("y1: ");
        int y1 = scan.nextInt();
        System.out.print("y2: ");
        int y2 = scan.nextInt();

        System.out.println("Enter the coordinates of second line");
        System.out.print("a1: ");
        int a1 = scan.nextInt();
        System.out.print("a2: ");
        int a2 = scan.nextInt();
        System.out.print("b1: ");
        int b1 = scan.nextInt();
        System.out.print("b2: ");
        int b2 = scan.nextInt();

        Double length1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        Double length2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));

        System.out.printf("Length of Line 1: %.2f\n",length1);
        System.out.printf("Length of Line 2: %.2f\n",length2);

        int result = length1.compareTo(length2);

        if(result == 0){
            System.out.println("Both lines are equal in length");
        } else if (result>0) {
            System.out.println("First line is longer than second line");
        }else {
            System.out.println("First line is shorter than second line");
        }

    }
}

