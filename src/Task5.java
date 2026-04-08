import java.util.HashMap;
import java.util.Scanner;

public class Task5 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size and target: ");
        int n = sc.nextInt(), target = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                System.out.println("Indexes: " + map.get(diff) + ", " + i);
                return;
            }
            map.put(nums[i], i);
        }
        System.out.println("No solution found");
    }
}