
/*
 * Remove Dups: Write code to remove duplicates from an unsorted linked-list
 * 
 */

class KToLast {
    static class Node {
        int data;
        Node next = null;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public static void main(String[] args) {
        KToLast LinkedList = new KToLast();
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(7);
        Node n5 = new Node(9);

        //Dummy nodes and Linked-List:
        LinkedList.head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;


        System.out.println("Linked-List: ");
        //Display list:
        LinkedList.printList();

        int thirdLast = LinkedList.KTHLast(3);

        System.out.println();

        //Print out kth to last node:
        System.out.println("Third Kth to last node is: " + thirdLast);

    }

    public int KTHLast(int k){
        Node dummy = head;

        if(head == null){
            return 0;
        }
        

        int length = 0;

        while(dummy != null){
            length++;
            dummy = dummy.next;
        }

        //Find location of Node
        int location = length - k;

        Node n = head;

        int counter = 0;

        while(n != null){
            //If we are at the location print the value:
            if(counter == location){
                return n.data;
            }
            counter++;
            n = n.next;
        }

        return 0;
    }

    public void printList() {
        Node n = head;
        if(head == null) {return;}

        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }


}
