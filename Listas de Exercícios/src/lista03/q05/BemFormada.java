package lista03.q05;

import java.util.Stack;

public class BemFormada {

    public static boolean teste(String expressao) {
        Stack<Character> pilha = new Stack<>();
        for (int i = 0; i < expressao.length(); i++) {
            if (expressao.charAt(i) == '(' || expressao.charAt(i) == '[') {
                pilha.push(expressao.charAt(i));
            } else {
                if (expressao.charAt(i) == ')' && !pilha.isEmpty()) {
                    if (pilha.pop() != '(') {
                        return false;
                    }
                }
                if (expressao.charAt(i) == ']' && !pilha.isEmpty()) {
                    if (pilha.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        return pilha.isEmpty();
    } 
    
    public static boolean teste2(String expressao) {
        Stack<Character> pilha = new Stack<>();
        for (int i = 0; i < expressao.length(); i++) {
            switch (expressao.charAt(i)) {
                case ')':
                    if (pilha.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (pilha.pop() != '[') {
                        return false;
                    }
                    break;
                default:
                    pilha.push(expressao.charAt(i));
            }
        }
        return pilha.isEmpty();
    }

}
