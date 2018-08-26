package DS;

import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.push("NY");
        stack.push("NJ");
        stack.push("FL");

        if (stack.peek().equalsIgnoreCase("NY")){
            System.out.println(stack.pop()); //will not return value cause O(1)
        }
        while (!stack.empty()){
            System.out.println((stack.pop())); //will return value
        }

    }
}
