import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
    private Node1 head;
    private int countOfNode = 0;

    public LinkedList1(){
        head=null;
    }

    public void addToStart(String itemName, int itemCount){
        Node1 newNode = new Node1(itemName,itemCount);
        if(head == null) {
            newNode.setLink(null);
            head = newNode;
            countOfNode++;
            }
        else {
            Node1 temp = head; head = newNode; head.setLink(temp);
            countOfNode++;
        }
    }

    public boolean deleteHeadNode(){
        if(head == null) {
            System.out.println("List is empty");
            return false;
        }
        else {
            head = head.getLink();
            countOfNode--;
            return true;
        }
    }

    public int size(){
        return countOfNode;
    }

    private Node1 find(String item){
        if(head==null){
            System.out.println("Node not found! (List is empty)");
            return null;
        }


    }

    public boolean contains(String item){
        Iterator<Node1> it =
    }

    public void printList(){
        toString();
    }

}
