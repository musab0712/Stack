public class StackUse {
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        stack.printStack();
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        System.out.println("Stack Size: "+stack.size());
        stack.printStack();
        stack.pop();
        stack.pop();
        System.out.println("Stack Size: "+stack.size());
        stack.printStack();

        System.out.println(" StackusingLL below......");

        StackusingLL sLL = new StackusingLL();
        sLL.printStack();
        sLL.push(10);
        sLL.push(15);
        sLL.push(20);
        sLL.push(25);
        System.out.println("Stack Size: "+sLL.size());
        sLL.printStack();
        sLL.pop();
        sLL.pop();
        System.out.println("Stack Size: "+sLL.size());
        sLL.printStack();

    }    
}
