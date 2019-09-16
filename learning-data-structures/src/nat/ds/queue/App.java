package nat.ds.queue;

import nat.ds.queue.model.Queue;

public class App {

    public static void main(String[] args){
        Queue queue = new Queue(5);
        queue.insert(1L);
        queue.insert(22L);
        queue.insert(333L);
        queue.insert(4444L);
        queue.insert(55555L);

        queue.insert(666666L);
        queue.insert(7777777L);

        queue.view();
    }
}
