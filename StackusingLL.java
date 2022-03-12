public class StackusingLL {
    private Node head;
    private int size;

    public StackusingLL(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public int peek(){
        return head.getData();
    }

    public int size(){
        return size;
    }

    public void push(int elem){
        Node new_Node = new Node(elem);
        new_Node.setNext(head);
        head = new_Node;
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
