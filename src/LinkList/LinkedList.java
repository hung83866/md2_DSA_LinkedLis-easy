package LinkList;

public class LinkedList<E> {
    private Node head;
    private int numberNodes = 0;

    public LinkedList(){
        head = new Node() ;
    }
    public LinkedList(E data){
        head = new Node(data) ;
        numberNodes++;
    }

    public int getNumberNodes() {
        return numberNodes;
    }

    public void setNumberNodes(int numberNodes) {
        this.numberNodes = numberNodes;
    }

    private class Node{
        private Node next;
        private E data;

        public Node() {
        }
        public Node(E data) {
            this.data = data;
        }
        public E getData(){
            return this.data;
        }

        @Override
        public String toString() {
            return "{" +
                    "data=" + data +
                    '}';
        }
    }
    public void add(int index, E data){
        Node temp = head;
        Node holder;
       if (index>0){
           for (int i = 0; i < (index - 1)&& temp.next != null;i++){
               temp = temp.next;
           }
           holder = temp.next;
           temp.next = new Node(data);
           temp.next.next = holder;
           numberNodes++;
       }else this.addFirst(data);
    }
    public  void addFirst(E data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numberNodes++;
    }
    public void addLast(E data){
        Node temp = head;
        for (int i = 0 ; i < numberNodes-1;i++ ){
            temp = temp.next;
        }
        temp.next = new Node(data);
        numberNodes++;
    }
    public E getElement(int index){
        Node temp = head;
        for (int i = 0 ; i < index;i++ ){
            temp = temp.next;
        }
        return (E)temp;
    }
    public void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }

    public E remove(int index){
        Node temp = head;
        Node holder ;
        if (index>=numberNodes||index<0){
            throw new IndexOutOfBoundsException("Index not found");
        }else {
            if(index == 0){
                holder = head;
                head = holder.next;
                numberNodes--;
            }else {
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                holder = temp.next;
                temp.next = holder.next;
                numberNodes--;
            }
        }
        return (E)holder;
    }
    public boolean remove1(E e){
        Node temp = head;
        for (int i = 0 ; i < numberNodes;i++){
            if (temp.getData() == e){
                this.remove(i);
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public LinkedList<E> clone(){
        LinkedList<E> newList = new LinkedList<>();
        newList.head = this.head;
        newList.setNumberNodes(numberNodes);
        for (int i = 0 ;i< numberNodes;i++){
            newList.head.next = this.head.next;

        }
        return newList;

    }
    public boolean contains(E e){
        Node temp = head;
        for (int i = 0 ; i < numberNodes;i++){
            if (temp.getData() == e){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public int indexOf(E e){
        Node temp = head;
        for (int i = 0 ; i < numberNodes;i++){
            if (temp.getData() == e){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
}
