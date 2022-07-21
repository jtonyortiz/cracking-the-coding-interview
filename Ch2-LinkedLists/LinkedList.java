public class LinkedList {

    static class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            next = null;
        }
    }

    //Head node of LinkedList:
    Node head;

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second;
        second.next = third;

        llist.printList();

    }

    //Print Linked-List:
    public void printList() {
        Node n = head;
        while(n != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    //Inseerts a new node at the front of the list:
    public void push(int new_data){

        //Create a new node with data
        Node new_node = new Node(new_data);

        //Make next of new node as head
        new_node.next = head;

        //Original head is now pointing to the new node
        head = new_node;
    }

}//LinkedList class