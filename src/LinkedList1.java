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
        Node1 thisLink = head;
        while(thisLink != null) {
            if(thisLink.getItem().equals(item)){
                return thisLink;
            }
            thisLink = thisLink.getLink();
        }
        return null;

    }

    public boolean contains(String item){

        Node1 thisLink2 = head;
        while(thisLink2 != null) {
            if(thisLink2.getItem()==item){
                return true;
            }
            thisLink2 = thisLink2.getLink();
        }
        return false;
    }

    public void printList(){
        Node1 thisLink3 = head;

        while(thisLink3 != null) {
            System.out.println(thisLink3.toString());
            thisLink3 = thisLink3.getLink();
        }
    }
    }


