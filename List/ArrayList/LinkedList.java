public class LinkedList 
{
    class Node 
    {
        int data;
        Node next;
        Node(int data) 
        {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    Node tail;
    // Insert node at the beginning
    public void inserthead(int data)
     {
        Node newnode = new Node(data);

        if (head == null) {
            head = tail = newnode;
        } 
        else {
            newnode.next = head;
            head = newnode;
        }
    }

    // Print the linked list
    public void printList() 
    {
        Node current = head;

        while (current != null) 
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) 
    {

        LinkedList list = new LinkedList();

        list.inserthead(1);
        list.inserthead(2);
        list.inserthead(3);
        list.inserthead(4);

        list.printList();
    }
}
