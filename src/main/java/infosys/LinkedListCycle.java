package infosys;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class LinkedListCycle{
    public static boolean hasCycle(ListNode head){

        if (head == null || head.next == null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // ---------- Test Case 1: Empty list ----------
        System.out.println(hasCycle(null)); // false

        // ---------- Test Case 2: Single node, no cycle ----------
        ListNode single = new ListNode(1);
        System.out.println(hasCycle(single)); // false

        // ---------- Test Case 3: Single node, self-cycle ----------
        ListNode self = new ListNode(1);
        self.next = self;
        System.out.println(hasCycle(self)); // true

        // ---------- Test Case 4: Multiple nodes, no cycle ----------
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        System.out.println(hasCycle(head1)); // false


        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        head.next.next.next.next = head.next;

        boolean result = hasCycle(head);
        System.out.println("Does the linked list have a cycle: "+result);
    }
}
