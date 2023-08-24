package projected;
public class LinkedList<T>{
    private Node<T> head;
    private int size;
    public LinkedList() {
        this.head = null;
    }
    
    public LinkedList(T val){
        this.head = new Node(val);
    }
    
    public T getFirst(){
        return isEmpty()? null : this.head.getValue();
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public T removeFirst(){
        T firstValue = null;
        if (!isEmpty()){
            firstValue = this.head.getValue();
            this.head = this.head.next;
            this.size--;
        }
        return firstValue;
    }
    
    public void addFirst(T val){
        Node first = new Node(val);
        first.next = this.head;
        this.head = first;
        this.size++;
    }
    
    public int size(){
        return this.size;
    }
    
    public void addLast(T value){
        if(isEmpty()){
            addFirst(value);
            return;
        }
        Node temp = this.head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(value, null);
        this.size++;
    }
}