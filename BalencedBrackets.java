import java.util.Stack;

public class BalencedBrackets {
    public boolean balencedBrackets(String expr){
        if(expr == null || expr.length() == 0)
            return true;
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < expr.length(); i++){
            if(expr.charAt(i) == ')'){
                if(!stk.isEmpty() && stk.peek() == '(')
                    stk.pop();
                else
                    return false;
            }
            else if(expr.charAt(i) == '}'){
                if(!stk.isEmpty() && stk.peek() == '{')
                    stk.pop();
                else
                    return false;
            }
            else if(expr.charAt(i) == ']'){
                if(!stk.isEmpty() && stk.peek() == '[')
                    stk.pop();
                else
                    return false;
            }
            else if(expr.charAt(i) == '(' || expr.charAt(i) == '{' || expr.charAt(i) == '['){
                stk.push(expr.charAt(i));
            }
        }
        if(stk.isEmpty())
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        BalencedBrackets bb = new BalencedBrackets();
        String expr = "{(a+b)}";
        System.out.println(bb.balencedBrackets(expr));
    }
}
