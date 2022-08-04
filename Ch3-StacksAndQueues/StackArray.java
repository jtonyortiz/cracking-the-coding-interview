import java.util.Stack;

public class StackArray {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    boolean isEmpty() {
        return (top < 0);
    }

    public StackArray(){
        top = -1;
    }

    public boolean push(int x){
        if (top >= (MAX - 1)){
            System.out.println("Stack Overflow");
            return false;
        }
        else{

            top++;
            a[top] = x;
            System.out.println(x + " pushed into stack.");
            return true;
        }
    }

    public int pop() {
        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int x = a[top--];
            return x;
        }
    }

    public int peek() {

        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }else {
            int x = a[top];
            return x;
        }
    }

    public void printStack(){
        for(int i = top; i > -1; i--){
            System.out.print(" " + a[i]);
        }
    }

    public static void main(String[] args) {
        
        StackArray s = new StackArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is : " + s.peek());
        System.out.print("Elements present in the stack: ");
        s.printStack();
    }



}
