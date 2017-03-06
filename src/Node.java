
/**
 * Created by Hewon Jeong on 06/03/2017.
 */
public class Node {
    private Object data;
    private Node next;

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public Object getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String toString() {
        return String.valueOf(this.data);
    }
}
