public class LinkedListApp {

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        //each time we insert something we are going to override our initial list
        list = list.insert(list, 1);
        list = list.insert(list, 2);
        list = list.insert(list, 7);
        list = list.insert(list, 3);
        list = list.insert(list, 4);
        list = list.insert(list, 8);
        list = list.insert(list, 9);

        list.printList(list);
    }
}
