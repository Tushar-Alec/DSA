import java.util.Stack;

public class main {
    public static void main(String[] args) {

    Stack<String> stack = new Stack<String>();
    stack.push("laptop");
    stack.push("headphone");
    stack.push("Book");
    stack.push("Mobile");

    // System.out.println(stack.peek());
    
    

    System.out.println(stack.search(""));
    }
}