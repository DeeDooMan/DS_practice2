public class Node1 {
    private String item;
    private int count;
    private Node1 link;
    public Node1(){
        link = null;
        item=null;
        count=0;
    }
    public Node1(String newItem, int newCount){
        setData(newItem, newCount);
    }

    public void setData(String newItem, int newCount){
        item=newItem;
        count=newCount;
    }

    public Node1 getLink() {
        return link;
    }

    public void setLink(Node1 link) {
        this.link = link;
    }

    public String getItem() {
        return item;
    }

    public int getCount() {
        return count;
    }
}
