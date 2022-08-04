/*
 * Author: James Ortiz
 * File: StackAsLinkedList.java
 * Compile: javac StackAsLinkedList.java 
 * java StackAsLinkedList
 */

public class StackAsLinkedList {
  
    //StackNode class to represent the Node in the LinkedList
    static class StackNode {
        int data;
        StackNode next;
  
        StackNode(int data) 
        { 
            this.data = data; 
        }
    }

    StackNode root; //Root field, used as reference for the LikedList
  
    //Funtion: isEmpty()
    //Used to check if the Stack is empty
    //If empty it return true, otherwise false
    //Returns: Boolean value
    public boolean isEmpty()
    {
        if (root == null) {
            return true;
        }
        else{
            return false;
        }
    }

    //Function: push()
    //Pushes an element into the stack
    //Returns: void
    public void push(int data)
    {
        //Create a new node with initiated data
        StackNode newNode = new StackNode(data);
  
        //Check if the head is null, if so
        //assign the root of the stack to the new Node
        if (root == null) {
            root = newNode;
        }
        else {
            //If there are elements in the stack
            //replace the root with the new Node,
            //assign the next node to the temporary node
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }

        //Display element data:
        System.out.println(data + " pushed to stack");
    }
  
    //Function: pop()
    //If the root of the stack is null, return 0
    //else return the element that was popped
    public int pop()
    {
        int popped = Integer.MIN_VALUE;
        //If llist was empty return message

        if (root == null) {
            System.out.println("Stack is Empty");
        }
        else {
            //Otherwise assign popped value
            //and move LList head to the next node
            popped = root.data;
            root = root.next;
        }

        //Return value
        return popped;
    }
  
    //Function: peek()
    //Displays the value at the top of the stack
    //If there is no value, 0 and a message is displayed
    //Returns: integer
    public int peek()
    {

        if (root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else {
            return root.data;
        }
    }
  
    // Main dirver code for StackAsLinkedList:
    public static void main(String[] args)
    {
  
        StackAsLinkedList sll = new StackAsLinkedList();
  
        sll.push(10);
        sll.push(20);
        sll.push(30);
        sll.push(50);
        sll.push(70);

        //70 gets popped here, and siaplyed as value.
        System.out.println(sll.pop()
                           + " popped from stack");
  
        //Display top element:
        System.out.println("Top element is " + sll.peek());
    }
}