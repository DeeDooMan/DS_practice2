import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
    private LinkedListDemo
    private Node1 head;

    public LinkedList1(){
        head=null;
    }

    public void addToStart(String itemName, int itemCount){
        head.setData(itemName,itemCount);
        head = new Node1(itemName,itemCount,head)
    }

    public boolean deleteHeadNode(){
        head=null;
    }

    public int size(LinkedListDemo){

    }

    private Node1 find(String item){

    }

    public boolean contains(String item){
        Iterator<Node1> it =
    }
    public void printList(){
        toString();
    }
}
