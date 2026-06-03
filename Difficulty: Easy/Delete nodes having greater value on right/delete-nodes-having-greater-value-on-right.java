class Solution {

    Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    Node compute(Node head) {

        // Reverse the list
        head = reverse(head);

        Node maxNode = head;
        Node curr = head;

        while (curr != null && curr.next != null) {

            if (curr.next.data < maxNode.data) {
                curr.next = curr.next.next; // delete node
            } else {
                curr = curr.next;
                maxNode = curr;
            }
        }

        // Reverse again
        return reverse(head);
    }
}