import java.util.EmptyStackException;
import java.util.Stack;

public class ValidParentheses20 {
    public static void main(String[] args) {
        String parentesis = "{}[]()";
        parentesis = "]";
        System.out.println(isValid(parentesis));
    }
    public static boolean isValid(String s) {
        Stack<Character> pilaParentesis = new Stack<>();
        try{
            Character c;
            Character dato;
            for(int i = 0; i < s.length();i++){
                c = s.charAt(i);
                switch (c){
                    case '(':
                    case '{':
                    case '[':
                        pilaParentesis.push(c);
                        break;
                    case ')':
                        dato = pilaParentesis.peek();
                        if(dato=='('){
                            pilaParentesis.pop();
                            break;
                        }else return false;
                    case '}':
                        dato = pilaParentesis.peek();
                        if(dato=='{'){
                            pilaParentesis.pop();
                            break;
                        }else return false;
                    case ']':
                        dato = pilaParentesis.peek();
                        if(dato=='['){
                            pilaParentesis.pop();
                            break;
                        }else return false;
                }
            }
            if(pilaParentesis.isEmpty()) return true;
            else return false;
        }catch (EmptyStackException e){
            return false;
        }
    }
}
