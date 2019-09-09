package nat.adt;

import nat.adt.model.Counter;

public class App {

    public static void main(String[] args){

        Counter counter = new Counter("Simple Counter");
        counter.increment();
        counter.increment();
        counter.increment();

        System.out.println(counter.getCurrentValue());
    }
}
