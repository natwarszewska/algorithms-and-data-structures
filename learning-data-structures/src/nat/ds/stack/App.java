package nat.ds.stack;

import nat.ds.stack.model.SimpleCharStack;
import nat.ds.stack.model.SimpleStack;

public class App {

    public static void main(String[] args){

        runSimpleStack();
        runStackReverseString();
    }

    private static void runSimpleStack(){

        System.out.println("TEST: runSimpleStack --------------------------------------");

        SimpleStack simpleStack = new SimpleStack(5);
        while(!simpleStack.isFull()){
            long value = System.nanoTime();
            simpleStack.push(value);
            System.out.println("Pushed: " + value);
        }
        simpleStack.push(System.nanoTime());
        System.out.println("Last pushed: " + simpleStack.peak() + "\n");

        while(!simpleStack.isEmpty()){
            System.out.println("Popped: " + simpleStack.pop());
        }
        System.out.println("Pop again: " + simpleStack.pop());
        System.out.println("Peak: " + simpleStack.pop());
    }

    private static void runStackReverseString(){

        System.out.println("TEST: runStackReverseString -----------------------------");
        String textToreverse = "Hello there!";
        int textLength = textToreverse.length();

        SimpleCharStack stack = new SimpleCharStack(textLength);

        for(int i = 0; i < textLength; i++) {
            char ch = textToreverse.charAt(i);
            stack.push(ch);
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }

    }
}
