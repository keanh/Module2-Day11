import org.jetbrains.annotations.NotNull;

import java.util.Stack;

public class checkBracket {
    public static void main(String[] args) {
        String str = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        checkBracket bracket = new checkBracket();
        System.out.println(bracket.check(str));
    }

    public boolean check(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i<str.length();i++){
            if (str.charAt(i) == '('){
                stack.push(str.charAt(i));
            }else{
                if (str.charAt(i) == ')'){
                    if (stack.empty()){
                        return false;
                    } else stack.pop();
                }
            }
        }
        return stack.empty() ;
    }
}
