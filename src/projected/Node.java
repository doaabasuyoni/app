package projected;
public class Node<T>{
    T value;
    Node next;
    public Node(T val){
        this(val, null);
    }   
    public Node(T val, Node next){
        this.value = val;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }    
}