package nat.ds.stack.model;

public class SimpleStack {

    private int maxSize;        // size of a stack
    private long[] stackArray;  // list of elements
    private int top;            // index of last pushed element

    // initializing stack
    public SimpleStack(int size){
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long value){
        if(isFull()) {
            System.out.println("Stack is already full!\n");
        } else {
            top++;
            stackArray[top] = value;
        }
    }

    public Long pop(){
        if(isEmpty()) {
            System.out.println("Stack is already empty!\n");
            return null;
        } else {
            int previousTop = top;
            top--;
            return stackArray[previousTop];
        }
    }

    public Long peak(){
        if(isEmpty()) {
            System.out.println("Stack is empty!\n");
            return null;
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
