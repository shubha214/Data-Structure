class Node {
int data;
Node next;

Node(int x) {
this.data = x;
this.next = null;
}
}

class GFG {

// Function to get the middle value of the linked list
static int getMiddle(Node head) {
if (head == null) return -1; // Return -1 or any flag for empty list

Node slow = head;
Node fast = head;

// Move fast by 2 steps and slow by 1 step
while (fast != null && fast.next != null) {
slow = slow.next;
fast = fast.next.next;
}

return slow.data;
}

public static void main(String[] args) {
// Create a hard-coded linked list: 10 -> 20 -> 30 -> 40 -> 50 -> 60
Node head = new Node(10);
head.next = new Node(20);
head.next.next = new Node(30);
head.next.next.next = new Node(40);
head.next.next.next.next = new Node(50);
head.next.next.next.next.next = new Node(60);

System.out.println("Middle element is: " + getMiddle(head));
}
}
