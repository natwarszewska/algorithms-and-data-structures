package nat.ds.list.linkedlist.model;

public class Node {

    private int data;
    private Node next = null;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }
}
