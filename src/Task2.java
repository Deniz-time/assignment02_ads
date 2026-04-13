class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Task2 {
    public static void run() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head;

        System.out.println("Cycle detected: " + (hasCycle(head) ? "YES" : "NO"));
    }

    private static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
