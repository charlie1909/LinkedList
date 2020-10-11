public class LinkedList implements Cloneable{

    //So a linked list is typically made up of two distinct objects. The first one was sometimes known
    //as the nodes, which are each individual element of the list. And then the
    //second object is the list itself, the actual architecture that keeps
    //everything together, that tracks where the beginning and ends of the list are.

    private Node head;
    private static int size;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data){
        Node newNode = new Node(data);
        newNode.next=null;

        if(list.head ==null){
            list.head = newNode;
        }else{
            Node last = list.head;
            while(last.next != null){
                //if last isnt null it means we are midway through the list
                //if the next variable becomes null, we want to append the new data to the node
                last = last.next;
            }
            //add the new data to the end of the list
            last.next = newNode;
        }
        size++;
        return list;
    }

    public static void printList(LinkedList list){
        Node currentNode = list.head;

        System.out.println("LinkedList : " );
        while(currentNode != null){
            System.out.println(currentNode.data + " " );
            currentNode = currentNode.next;
        }
    }

    public boolean equals(Object o){
        if (o == null){
            return false;
        }
        //equivalence testing of linked lists
        if(getClass() != o.getClass()){
            return false;
        }
        LinkedList other = (LinkedList) o;
        if(size != other.size){
            return false;
        }
        Node nodeA = head;
        Node nodeB = other.head;
        while(nodeA != null){
            if(nodeA.data != nodeB.data){
                return false;
            }
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        return true;
    }

    public LinkedList clone()throws CloneNotSupportedException{
        LinkedList other = (LinkedList) super.clone();
        if(size > 0){
            other.head = new Node(head.data);
            Node nodeA = head.next;
            Node otherNode = other.head;
            while(nodeA != null){
                Node newest = new Node(nodeA.data);
                otherNode.next = newest;
                nodeA = nodeA.next;
            }
        }
        return other;
    }

}
