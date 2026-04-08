import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        moveZeroes(nums);
        System.out.println("Result: " + Arrays.toString(nums));
    }

    private static void moveZeroes(int[] nums) {
        int lastNonZeroAt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroAt++] = nums[i];
            }
        }
        while (lastNonZeroAt < nums.length) {
            nums[lastNonZeroAt++] = 0;
        }
    }
}
