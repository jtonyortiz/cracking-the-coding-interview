import java.util.ArrayList;

public class PalindromeLL {
    
    static class Node {
        char data;
        Node next;
        
        public Node(char data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public static void main(String[] args) {
        PalindromeLL llist = new PalindromeLL();

        llist.head = new Node('a');
        Node second = new Node('b');
        Node third = new Node('a');

        llist.head.next = second;
        second.next = third;

        llist.PrintList();

        //TODO: 
        if(llist.checkIfPailindrome() == true){
            System.out.println("Linked-List is a palindrome.");
        }else{
            System.out.println("Linked-List is not a palindrome.");
        }
    }

    //Print LinkedList
    public void PrintList() {
        Node n = head;
        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }

        System.out.println();
    }


    //Inserts a new node at the front of the list:
    public void push(char new_data){

        //Create a new node with data
        Node new_node = new Node(new_data);

        //Make next of new node as head
        new_node.next = head;

        //Original head is now pointing to the new node
        head = new_node;
    }


    public boolean checkIfPailindrome() {
        Node n = head;
        ArrayList<Character> charr = new ArrayList<>();

        while(n != null){
            charr.add(n.data);
            n = n.next;
        }


        int j = charr.size() - 1;

        for(int i = 0; i < charr.size()/2; i++){
            if(charr.get(i) != charr.get(j)){
                return false;
            }

            j--;
        }

        return true;
    }




    
}
