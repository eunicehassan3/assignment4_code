import java.util.Stack;
public class InfixToPostfix {
    public String infixToPostfix(String infix){

        Stack<Character> stack = new Stack<>();
        String postfix = "";
        char[] arr = infix.toCharArray();
        for(char c: arr){
            if(Character.isDigit(c) || Character.isAlphabetic(c)){
               postfix += c;
            }
            else if (c == '('){
                stack.push(c);
            }
            else if (c == ')'){
                while (!stack.isEmpty() && !(stack.peek() == '(')){
                    postfix += stack.pop();
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty() && findValue(stack.peek()) >= findValue(c)) {
                        postfix += stack.pop();
                    }
                stack.push(c);
                }
            }

        while(!stack.isEmpty()){
            postfix += (stack.pop());
        }

        return postfix;
    }

    public int findValue(Character c){
        if(c == '^'){
            return 3;
        }if(c == '*' || c == '/'){
            return 2;
        }if(c == '+' || c == '-'){
            return 1;
        }
            return -1;
    }
}
