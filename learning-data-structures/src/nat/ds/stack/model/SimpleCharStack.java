package nat.ds.stack.model;

public class SimpleCharStack {

    private int maxSize;        // size of a stack
    private char[] stackArray;  // list of elements
    private int top;            // index of last pushed element

    // initializing stack
    public SimpleCharStack(int size){
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char value){
        if(isFull()) {
            System.out.println("Stack is already full!\n");
        } else {
            top++;
            stackArray[top] = value;
        }
    }

    public char pop(){
        if(isEmpty()) {
            System.out.println("Stack is already empty!\n");
            return 0;
        } else {
            int previousTop = top;
            top--;
            return stackArray[previousTop];
        }
    }

    public char peak(){
        if(isEmpty()) {
            System.out.println("Stack is empty!\n");
            return 0;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == maxSize-1;
    }
}
