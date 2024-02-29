import java.util.Stack;

public class balancedBrackets {
    public String balancedBracket(String s){
        Stack<Character> bracketStack  = new Stack<>();
        char[] sArray = s.toCharArray();

        for(int i = 0; i < sArray.length; i++){
            if(sArray[i] == '(' || sArray[i] == '[' || sArray[i] == '{'){
                bracketStack.push(sArray[i]);
            }
            else{
                if(isPair(bracketStack.peek(), sArray[i]) && !(bracketStack.empty())){
                    bracketStack.pop();
                }
            }
        }

        if(bracketStack.empty()){
            return "YES";
        }
        else{
            return "NO";
        }
    }

    public boolean isPair(char opening, char closing){
        if(opening == '{' && closing == '}'){
            return true;
        }
        if(opening == '[' && closing == ']'){
            return true;
        }
        if(opening == '(' && closing == ')'){
            return true;
        }
        return false;
    }
}
