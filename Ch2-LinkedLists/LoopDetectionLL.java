import java.util.HashSet;

public class LoopDetectionLL {
    
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void push(int new_data){

        Node new_node = new Node(new_data);

        //Make next of new node as the head:
        new_node.next = head;

        //Original head is now pointing to the new node:
        head = new_node;
    }


    public void print_list(){

        Node n = head;

        //Iterate through LinkedList
        while(n != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
    }


    public static void main(String[] args) {
        LoopDetectionLL loopLList = new LoopDetectionLL();

        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        loopLList.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;

        boolean result = loopLList.checkLoop();

        if(result == true){
            System.out.println("There is a Loop in this linked-list.");
        }else{
            System.out.println("There exists no loop in this linked-list.");
        }

    }


    public boolean checkLoop(){
        Node n = head;

        HashSet<Node> hset = new HashSet<>();

        while(n != null){

            if(hset.contains(n)){

                System.out.println("The node at the beginning of the loop is: " + n.data);
                return true;
            }
            

            hset.add(n);
            n = n.next;
        }

        return false;
    }




}
