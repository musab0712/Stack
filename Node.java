public class Node {
    private int data;
    private Node next;
    
     public Node(int elem){
         data = elem;
         next = null;
    }
    public void setData(int elem){
        data = elem;
    }
    public int getData(){
        return data;
    }
    public void setNext(Node n){
        next = n;
    }
    public Node getNext(){
        return next;
    }
}