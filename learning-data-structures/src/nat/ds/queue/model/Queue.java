package nat.ds.queue.model;

public class Queue {

    private int maxSixe;        // initializes the set number of slots
    private long[] queueArray;  // slots to main the data
    private int front;          // index position of front element
    private int rear;           // index position of back element
    private int nItems;         // number of items in queue

    public Queue(int size){
        this.maxSixe = size;
        this.queueArray = new long[size];
        front = 0;
        rear = -1;  // no item in array yet
        nItems = 0;
    }

    public void insert(long j){
        if(rear == maxSixe-1){
            remove();
            for(int i  = 0; i < maxSixe - 1; i++){
                queueArray[i] = queueArray[i+1];
            }
            rear--;
        }
        rear++;
        queueArray[rear] = j;
        nItems++;
    }

    public void view(){
        System.out.print("[ ");
        for (int i =0; i < queueArray.length; i++){
            System.out.print(queueArray[i] + " ");
        }
        System.out.print("]");
    }

    public long remove(){
        long elementToReturn = queueArray[front];
        front++;
        if(front == maxSixe){
            front = 0;
        }
        nItems--;
        return elementToReturn;
    }

    public long peakFront(){
        return queueArray[front];
    }

    public boolean isEmpty(){
        return nItems == 0;
    }

    public boolean isFull(){
        return nItems == maxSixe;
    }
}
