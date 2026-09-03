class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        // Find the middle of the linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half
        ListNode prev = null;
        ListNode curr = slow;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Compare both halves
        ListNode left = head;
        ListNode right = prev;

        while (right != null) {
            if (left.val != right.val) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }
}