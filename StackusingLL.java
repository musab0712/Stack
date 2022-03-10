public class StackusingLL {
    private Node head;
    private int size;

    public StackusingLL(){
        head = null;
        size = -1;
    }

    public boolean isEmpty(){
        return (size == -1);
    }

    public int top(){
        return head.getData();
    }

    public int size(){
        return size+1;
    }

    public void push(int elem){
        Node new_Node = new Node(elem);
        if(head == null)
            head = new_Node;
        else{
            Node temp = head;
            head = new_Node;
            new_Node.setNext(temp);
        }
        size++;
    }

    public int pop(){
        int value = head.getData();;
        head = head.getNext();
        size--;
        return value;
    }

    public void printStack(){
        if(isEmpty()==true)
            System.out.println("Stack is Empty....");
        else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.getData()+"  ");
                temp = temp.getNext();
            }
            System.out.println();
        }
    }


}
