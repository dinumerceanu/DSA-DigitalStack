package Curs2;

public class LinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void delete(int data) {
        if(head == null) return;

        if(head.data == data) {
            head = head.next;
        }

        Node currentNode = head;
        while(currentNode.next != null) {
            if(currentNode.next.data == data) {
                currentNode.next = currentNode.next.next;
            }
            currentNode = currentNode.next; 
        } 
    }

    public void display() {
        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next; 
        } 
        System.out.println("null");
    }

    public void findMiddle() {
        if(head == null) {
            System.out.println("The list is empty!");
            return;
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle is: " + slow.data);
    }

    public boolean hasCycle() {
        if(head == null) {
            System.out.println("The list is empty!");
            return false;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            System.out.println(slow.data + " " + fast.data);
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public void createCycle() {
        if(head == null) return;

        Node currentNode = head;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = head.next;
    }

    public Node reveseList(LinkedList new_list) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            new_list.head = this.head;
        } else {
            head.next.reverseList(new_list);
            return null;
        }
    }

    public static void main(String args[]) {
        LinkedList l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.createCycle();
        // l.display();
        // l.findMiddle();
        System.out.println(l.hasCycle());
    }
}