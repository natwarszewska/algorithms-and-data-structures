package nat.adt.model;

public class Counter {

    private String name;
    private int counterValue;

    public Counter(String str){
        this.name = str;
    }

    public void increment(){
        this.counterValue++;
    }

    public int getCurrentValue(){
        return this.counterValue;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "name: " + this.name +
                ", counterValue: " + this.counterValue +
                "}";
    }
}
