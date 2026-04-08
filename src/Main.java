import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose task:");
        System.out.println("1 - Move Zeroes");
        System.out.println("2 - Floyd’s Algorithm");
        System.out.println("3 - Balanced Parentheses");
        System.out.println("4 - Generate Binary Numbers");
        System.out.println("5 - Hash Table");
        System.out.println("6 - Validate BST");
        System.out.println("7 - K-th Largest Element");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Task1.run();
                break;
            case 2:
                Task2.run();
                break;
            case 3:
                Task3.run();
                break;
            case 4:
                Task4.run();
                break;
            case 5:
                Task5.run();
                break;
            case 6:
                Task6.run();
                break;
            case 7:
                Task7.run();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
