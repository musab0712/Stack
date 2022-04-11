import java.util.Stack;

public class ReverseStack {
    public static void insertAtBottem(Stack<Integer> stack, int item){
        if(stack.isEmpty()){
            stack.push(item);
            return;
        }
        int top = stack.pop();
        insertAtBottem(stack, item);
        stack.push(top);
    }
    public static void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int item = stack.pop();
        reverseStack(stack);
        insertAtBottem(stack, item);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
        System.out.println("Original Stack is "+stack);
        reverseStack(stack);
        System.out.println("Reversed Stack is "+stack);
        
    }
}
