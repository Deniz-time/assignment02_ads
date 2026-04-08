import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task4 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = sc.nextInt();

        Queue<String> q = new LinkedList<>();
        q.add("1");
        System.out.print("Binary numbers: ");
        for (int i = 0; i < n; i++) {
            String current = q.poll();
            System.out.print(current + " ");
            q.add(current + "0");
            q.add(current + "1");
        }
        System.out.println();
    }
}