import java.util.Scanner;
import java.util.Stack;

public class Task3 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the line with brackets:");
        String s = sc.next();
        System.out.println("Result: " + (isValid(s) ? "YES" : "NO"));
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (c == ')' && top != '(' || c == '}' && top != '{' || c == ']' && top != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}