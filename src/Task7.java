import java.util.PriorityQueue;
import java.util.Scanner;

public class Task7 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size and K: ");
        int n = sc.nextInt(), k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) minHeap.poll();
        }
        System.out.println("K-th greatest element: " + minHeap.peek());
    }
}