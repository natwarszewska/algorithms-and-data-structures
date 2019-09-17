package nat.ds.list.linkedlist;

import nat.ds.list.linkedlist.model.Node;

public class App {

    public static void main (String[] args){

        // creating independent nodes
        Node nodeA = new Node(4, null);
        Node nodeB = new Node (3, null);
        Node nodeC = new Node (7, null);
        Node nodeD = new Node (8, null);

        // linking nodes   A -> B -> C -> D
        // last node always points to null
        nodeA.setNext(nodeB);
        nodeB.setNext(nodeC);
        nodeC.setNext(nodeD);

        System.out.println("List length (nodeA): " + listLength(nodeA));   // expected result is 4
        System.out.println("List length (nodeB): " + listLength(nodeB));   // expected result is 3

    }

    public static int listLength(Node n){
        int len = 0;
        Node currentNode = n;

        while(currentNode != null){
            len++;
            currentNode = currentNode.getNext();
        }
        return len;
    }
}
