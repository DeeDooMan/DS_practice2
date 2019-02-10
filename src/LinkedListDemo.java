public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        list.addToStart("Apples",1);
        list.addToStart("Bananas",2);
        list.addToStart("Lemones",3);

        System.out.println("Список содержит "+
                list.size()+" элементов");

        list.printList();
        if(list.contains("Apples")){
            System.out.println("Список содержит Apples");
        }
        else{
            System.out.println("Спсок не содержит Apples");
        }

        list.deleteHeadNode();
        list.printList();
    }
}
